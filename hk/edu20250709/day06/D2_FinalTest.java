package hk.edu20250709.day06;

import java.util.Arrays;

public class D2_FinalTest {
	
	//멤버필드에 상수 정의해서 사용
	public static final int num=100; //값도 같이 정의해야 함
	
	//참조타입 상수 선언 : 주소 변경 금지
	public static final int[] arrayNum= {1,2,3,4,5};
	
	public final int num2;//값을 정의하지 않을 경우 생성자를 통해 초기값 정의
	
	//생성자
	public D2_FinalTest(int num2) {
		this.num2=num2;
	}
	public static void main(String[] args) {
		int a =5;
			a =15;//값을 변경할 수 있음 --> 변수
			
		//상수 선언
		final int B=10;
//				  B=30; //값을 변경할 수 없음
		
		//메소드의 파라미터를 통해 값을 변경할 수 있다
		int result1=test01(10);
		int result2=test01(20);
		
		//생성자에 파라미터를 통해 값을 변경할 수 있다.
		D2_FinalTest ft = new D2_FinalTest(50);
		D2_FinalTest ft2 = new D2_FinalTest(30);
		
		arrayNum[0]=10;
		System.out.println(Arrays.toString(arrayNum));
		int [] test = new int[] {1,2,5,7,8,10};
//		arrayNum= test; //주소를 변경하려면 오류가 발생한다
	}
	
	//메서드에서 선언: 권장하기 않음
	public static int test01(int val) {
		final int aa=val;
//		aa=50; //변경할 수 없음
		return aa;
	}
}