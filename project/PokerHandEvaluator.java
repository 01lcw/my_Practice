package project;

import java.util.*;

public class PokerHandEvaluator {

    // 족보 우선순위
    private static final Map<String, Integer> handRank = Map.of(
        "하이카드", 1,
        "원페어", 2,
        "투페어", 3,
        "쓰리카드", 4,
        "스트레이트", 5,
        "플러시", 6,
        "풀하우스", 7,
        "포카드", 8,
        "스트레이트 플러시", 9,
        "로열 플러시", 10
    );

    // 카드 문자값을 숫자값으로 변환하는 map
    private static final Map<String, Integer> rankValue = Map.ofEntries(
        Map.entry("2", 2), Map.entry("3", 3), Map.entry("4", 4), Map.entry("5", 5),
        Map.entry("6", 6), Map.entry("7", 7), Map.entry("8", 8), Map.entry("9", 9),
        Map.entry("T", 10), Map.entry("J", 11), Map.entry("Q", 12),
        Map.entry("K", 13), Map.entry("A", 14)
    );

    // 카드 문자열에서 rank 문자만 추출 ("♠K" → "K")
    private static String extractRank(String cardStr) {
        return cardStr.substring(1);
    }

    // 카드 문자열에서 suit 문자만 추출 ("♠K" → "♠")
    private static String extractSuit(String cardStr) {
        return cardStr.substring(0, 1);
    }

    // 카드값 추출 ("♠K" → 13)
    private static int getCardValue(String cardStr) {
        return rankValue.get(extractRank(cardStr));
    }

    public static String evaluateHand(List<Card> playerCards, List<Card> tableCards) {
        List<Card> all = new ArrayList<>(playerCards);
        all.addAll(tableCards);

        // value별 개수 및 suit별 카드 모음
        Map<Integer, Integer> valueCount = new HashMap<>();
        Map<String, List<Card>> suitMap = new HashMap<>();
        Set<Integer> uniqueValues = new HashSet<>();

        for (Card c : all) {
            int val = getCardValue(c.getCard());
            valueCount.put(val, valueCount.getOrDefault(val, 0) + 1);
            uniqueValues.add(val);

            String suit = extractSuit(c.getCard());
            suitMap.computeIfAbsent(suit, k -> new ArrayList<>()).add(c);
        }

        // 플러시 or 스트레이트 플러시 or 로열 플러시
        for (List<Card> suited : suitMap.values()) {
            if (suited.size() >= 5) {
                List<Integer> flushValues = suited.stream()
                        .map(c -> getCardValue(c.getCard()))
                        .distinct()
                        .sorted()
                        .toList();
                if (isStraight(flushValues)) {
                    if (flushValues.containsAll(List.of(10, 11, 12, 13, 14))) return "로열 플러시";
                    return "스트레이트 플러시";
                }
                return "플러시";
            }
        }

        // 포카드
        if (valueCount.containsValue(4)) return "포카드";

        // 풀하우스
        boolean hasThree = valueCount.containsValue(3);
        boolean hasPair = valueCount.values().stream().anyMatch(v -> v >= 2 && v != 3);
        if (hasThree && hasPair) return "풀하우스";

        // 스트레이트
        List<Integer> valueList = new ArrayList<>(uniqueValues);
        Collections.sort(valueList);
        if (isStraight(valueList)) return "스트레이트";

        // 쓰리카드
        if (hasThree) return "쓰리카드";

        // 투페어
        long pairCount = valueCount.values().stream().filter(v -> v == 2).count();
        if (pairCount >= 2) return "투페어";

        // 원페어
        if (pairCount == 1) return "원페어";

        return "하이카드";
    }

    public static int compareHands(List<Card> p1Cards, List<Card> p2Cards, List<Card> tableCards) {
        String h1 = evaluateHand(p1Cards, tableCards);
        String h2 = evaluateHand(p2Cards, tableCards);

        return Integer.compare(handRank.get(h1), handRank.get(h2));
    }

    // 스트레이트 여부 확인
    private static boolean isStraight(List<Integer> values) {
        Set<Integer> set = new HashSet<>(values);
        if (set.containsAll(List.of(14, 2, 3, 4, 5))) return true; // Wheel

        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);
        for (int i = 0; i <= sorted.size() - 5; i++) {
            boolean straight = true;
            for (int j = 0; j < 4; j++) {
                if (sorted.get(i + j) + 1 != sorted.get(i + j + 1)) {
                    straight = false;
                    break;
                }
            }
            if (straight) return true;
        }
        return false;
    }
}
 