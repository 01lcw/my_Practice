package hk.edu20250703.day02;

public class D1_VariableTest {
	
	public static void main(String[] args) {
		
		//기본 타입의 특징
		//1.정수 타입
		//  기본형은 int
		byte b=1; //-128~127 숫자를 표현
//			 b=128; //128은 표현범위를 벗어남
		short sh = 128; //2byte의 크기
		int i =500000000;//int 4byte의 크기
		long l = 5000000000L; // 리터럴 값에 L이라고 붙여주면 long 타입으로 정의됨
		
		//2.실수타입
		//  기본형은 double
		double d = 15.8;
		float f = (float)10.2;
		float ff = 10.2f;
		float fff = (float)d+f; //double+float -> double + double = double
		
		//3.다른 타입끼리 연산
		int ii = (int)(i+d); //double+double --> int형 변환
		double dd =i+d; // 500000000.222
		int iii = (int)dd; // 500000000 실수 --> 정수로 변환하면 소수점 제거됨
		
		//4.정수끼리 연산
		byte b1 =10;
		byte b2 =20;
		byte b3 =(byte)(b1+b2); //byte끼리 연산해도 int형으로 반환
	}

}
