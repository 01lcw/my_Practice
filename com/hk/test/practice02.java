package com.hk.test;
//최대공약수
public class practice02 {
	
	//defalut 생성자: 파라미터가 없음 --> 생략 가능
	public practice02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//약수 구하는 메서드를 사용할 때
		//원하는 값을 요청하고 싶다면... 메서드에 값을 전달해야 됨

		greatDivisor(10,25);
		practice02 practice = new practice02();
		practice.greatDivisor(10,20);
	}
	
	public static int greatDivisor(int a, int b) {
		//값을 복사해서 할당함. immutable 특징: 변경되지 않는 성질 --> 기본타입의 특징
		int tempA = a;
		int tempB = b;
		
		while(true) {
			//a가 b보다 클 경우
			if(a>b) {
				a=a-b;
			}
			//b가 a보다 클 경우
			if(b>a) {
				b=b-a;
			}
			//a와 b가 같을 경우
			if(a==b) {
				break;
			}
		}
		System.out.printf("%d와 %d의 최대 공약수는 %d \n",tempA,tempB,a);
		return a;
	}
}
