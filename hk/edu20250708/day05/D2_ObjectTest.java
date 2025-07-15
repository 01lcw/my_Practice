package hk.edu20250708.day05;

public class D2_ObjectTest {

	public static void main(String[] args) {
		String str=new String("Object");
		String str2 ="ObjectLit";
		System.out.println(str+":"+str2);
		System.out.println(str.getClass());
		
		D2_ObjectTest ot = new D2_ObjectTest();
		System.out.println(ot.getClass());
		
		//toString(): 문자열을 반환한다.
		//     target이 객체일 경우 "위치@hashcode"반환
		System.out.println(ot.toString());
		
		//     target이 기본타입일 경우 값을 문자열로 반환
		int a = 10;
//		a.toString(); //a는 참조타입이 아님
		Integer ii=10;//Integer라는 클래스는 wrapper믈래스라고 함
		System.out.println(ii.toString());
		
		//hashcode
		System.out.println(ot.hashCode());
		
		//equals(): 참조타입을 비교할 때 사용 --> hashcode로 비교하다. --> hashCode()
		System.out.println(ot.equals(str)); //일반 참조타입끼리 비교는 의미가 없다
		
		//리터럴방식선언
		String s="a";
		String s2="a";
		System.out.println(s==s2); //동등연산자는 주소로 비교
		System.out.println(s.equals(s2));//equals는 hashcode로 비교
		
		//객체 생성 new선언
		String s3=new String("a");
		System.out.println(s==s3);
		System.out.println(s.equals(s3));
	}
}