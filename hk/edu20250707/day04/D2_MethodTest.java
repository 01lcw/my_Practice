package hk.edu20250707.day04;

public class D2_MethodTest {
	
	//main메서드는 코드를 간결하게 작성
	//구현된 메서드를 실행시켜주는 메서드
	public static void main(String[] args) {
		D2_MethodTest.test01();
	}
	//메서드 유형
	//1. static과 non-static 유형
	//   공통기능을 구현할 때
	public static void test01() {
		System.out.println("static메서드");
//		test02();//static에서 non-static사용못함
		D2_MethodTest mt = new D2_MethodTest();
			mt.test02();//객체 생성하면 사용할 수 있음
	}
	public void test02() {
		System.out.println("non-static메서드");
	}
	//2.반환타입O / 반환타입X
	public int test03() {
		int i =0; 
		//주요 코드 작성
		return i;//반환타입을 선언했다면 반드시 return을 정의해야 함
	}
	public void test04() {
//		return 9; //반환하면 안됨
	}
	
	//3.파라미터 O/X : 외부로부터 값을 전달받으려고
	public static int test05(int a, int b) {
		int result = 0;
		if(a>b) {
			result=a;
		}
		return result;
	}
}
