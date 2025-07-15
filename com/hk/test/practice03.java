package com.hk.test;

public class practice03 {

	public static void main(String[] args) {
		
		lowestMultiple(2,4);
	}
	//최소공배수 구하는 매서드: (a*b)/(a,b의 최대공약수)
	public static void lowestMultiple(int a, int b) {
		//최대공약수 구하기
		int tempA = a;
		int tempB = b;

		while(true) {
			if(a>b) {
				a=a-b;
			}
			if(a<b) {
				b=b-a;
			}
			if(a==b) {
				break;
			}
		}
		int result = (tempA*tempB)/a;
		System.out.printf("최대공약수는 %d, 최소 공배수는 %d",a,result);	

	}
	
}
