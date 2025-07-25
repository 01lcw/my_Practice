package hk.edu20250725.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class D2_StreamTest {
	public static void main(String[] args) {
		
		//List객체 -> Stream객체로 생성 -> 중간연산, 최종연산
		List<String> list=Arrays.asList("홍길동","임꺽정","김홍도");
//		list.add("이순신");//기존 List와는 약간 다르다. add()사용 X
		Stream<String> streamList=list.stream();//Stream 생성
//		streamList.filter(s->s.contains("홍")).sorted()
//						.forEach(s->System.out.println(s));
					// 익명(String s){Systme.out.println(s);}
		//Stream객체는 한번 사용하면 끝남. 다시 못씀
		streamList.filter(s->s.startsWith("홍"))
//				  .forEach(s->System.out.println(s));
				  .forEach(System.out::println);
		
		System.out.println("---Stream을 사용하지 않을 경우---");
		List<String> list2=new ArrayList<>();
		for (String s : list) {
			if(s.contains("홍")) {
				list2.add(s);
			}
		}
		Collections.sort(list2); //정렬
		for (String s : list2) {
			System.out.println(s);
		}
		
		//List 객체를 Stream객체로 생성한 후 맵핑과 수집 처리
		//Stream은 원본데이터를 변경시키지 않는다.
		List<Integer> listNum=list.stream()
//								  .map(s->s.length())
								  .map(String::length)
								  .collect(Collectors.toList());
		System.out.println(listNum.toString());
		
		System.out.println("---병렬처리---");
		
		List<String> list3=List.of("A","B","c","D");
		
		//일반 스트림
		list3.stream().forEach(s->{
			System.out.println(s+"-"+Thread.currentThread().getName());
		});
		
		System.out.println("-------------------------------");
		//병렬 스트림
		list3.parallelStream().forEach(s -> {
			System.out.println(s+"-"+Thread.currentThread().getName());
		});
		
	}//main 종료
}
