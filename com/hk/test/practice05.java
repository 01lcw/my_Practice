package com.hk.test;

public class practice05 {

	public static void main(String[] args) {
		int b= 8;
		if(b==perfectNumber(b)) {
			System.out.printf("%d은(는) 완전수이다",b);
		}
		else {
			System.out.printf("%d은(는) 완전수가 아니다",b);
		}

	}
	public static int perfectNumber(int a) {
		int sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
}
