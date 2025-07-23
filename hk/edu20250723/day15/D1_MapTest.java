package hk.edu20250723.day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D1_MapTest {
	public static void main(String[] args) {
		//Map-> key1:value
		//		key2:value
		//jS -> Json 형식을 사용하는 객체가 있다
		//		{key1:value, key2:value..}
		//Map -> json형식으로 변환할 수 있다.
		
		Map<String, String> map = new HashMap<>();
		map.put("하나", "한경");
		map.put("둘", "닷컴");
		map.put("셋", "교육센터");
		map.put("넷", "센터교육");//key 중복되면 안됨
		
		System.out.println(map.get("하나")+","+map.get("둘"));
		//Map에서 일괄적으로 데이터를 모두 가져오려면..
		Set<String> setKeyMap=map.keySet(); //key값만 Set에 담아 반환
		//iterator pattern 이용
		Iterator<String> iter=setKeyMap.iterator();
		while(iter.hasNext()) {
			String str=iter.next();//key값을 가져온다.
			System.out.println(map.get(str));
		}
		
		//향상된 for문 이용
		for (String str : setKeyMap) {
			System.out.println(map.get(str));
		}
	}
}
