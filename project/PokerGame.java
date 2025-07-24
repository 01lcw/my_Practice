package project;

import java.util.*;

public class PokerGame {

    private List<Card> deck;
    private List<Card> player1;
    private List<Card> player2;
    private List<Card> table;
    private int player1Score = 0;
    private int player2Score = 0;
    private final int WIN_SCORE = 10;
    private Scanner scanner = new Scanner(System.in);

    public void startGame() {
        System.out.println("텍사스 홀덤 게임 시작 (선승 10점)");
        
        while (player1Score < WIN_SCORE && player2Score < WIN_SCORE) {
            setupNewRound();

            System.out.println("\n--- 새로운 라운드 ---");
            System.out.println("플레이어 1 카드: " + player1);
 //           System.out.println("플레이어 2 카드: " + player2);

            // 플랍 (3장 오픈)
            table.add(drawCard());
            table.add(drawCard());
            table.add(drawCard());
            System.out.println("테이블 카드 (플랍): " + table);

            // 1차 선택
            if (!continuePhase(1)) continue;
            if (!continuePhase(2)) continue;

            // 턴 (1장 추가 오픈)
            table.add(drawCard());
            System.out.println("테이블 카드 (턴): " + table);

            // 2차 선택
            if (!continuePhase(1)) continue;
            if (!continuePhase(2)) continue;

            // 리버 (1장 추가 오픈)
            table.add(drawCard());
            System.out.println("테이블 카드 (리버): " + table);

            // 최종 비교
            String h1 = PokerHandEvaluator.evaluateHand(player1, table);
            String h2 = PokerHandEvaluator.evaluateHand(player2, table);
            int cmp = PokerHandEvaluator.compareHands(player1, player2, table);
            System.out.println("플레이어 1 족보: " + h1);
            System.out.println("플레이어 2 족보: " + h2);

            if (cmp > 0) {
                System.out.println("플레이어 2 승!");
                player2Score++;
            } else if (cmp < 0) {
                System.out.println("플레이어 1 승!");
                player1Score++;
            } else {
                System.out.println("무승부입니다.");
            }

            printScore();
        }

        // 최종 승자 출력
        if (player1Score >= WIN_SCORE) {
            System.out.println("\n플레이어 1이 최종 승리했습니다!");
        } else {
            System.out.println("\n플레이어 2가 최종 승리했습니다!");
        }
    }

    private void setupNewRound() {
        deck = new ArrayList<>();
        for (String suit : Card.DECK) {
            for (String rank : Card.STECK) {
                Card c = new Card();
                while (true) {
                    c.init();
                    if (!deck.contains(c)) break;
                }
                deck.add(c);
            }
        }
        Collections.shuffle(deck);
        player1 = new ArrayList<>(List.of(drawCard(), drawCard()));
        player2 = new ArrayList<>(List.of(drawCard(), drawCard()));
        table = new ArrayList<>();
    }

    private boolean continuePhase(int playerNum) {
        if (playerNum == 1) {
            System.out.print("플레이어 1, 계속하시겠습니까? (y/n): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("n")) {
                System.out.println("플레이어 1 폴드 → 플레이어 2 1점 획득");
                player2Score++;
                printScore();
                return false;
            }
            return true;
        } else {
            // 간단한 AI 전략: 80% 확률로 계속 진행, 20% 확률로 폴드
            boolean decision = Math.random() < 0.8;
            System.out.println("플레이어 2(컴퓨터)의 선택: " + (decision ? "계속" : "폴드"));
            if (!decision) {
                System.out.println("플레이어 2 폴드 → 플레이어 1 1점 획득");
                player1Score++;
                printScore();
                return false;
            }
            return true;
        }
    }


    private Card drawCard() {
        return deck.remove(0);
    }

    private void printScore() {
        System.out.println("현재 점수: 플레이어1 = " + player1Score + "점, 플레이어2 = " + player2Score+"점");
    }

    public static void main(String[] args) {
        PokerGame game = new PokerGame();
        game.startGame();
    }
}
