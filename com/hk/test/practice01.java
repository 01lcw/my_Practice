package com.hk.test;

public class practice01 {

	public static void main(String[] args) {
		divisor(20);
	}
	
	public static void divisor(int number) {
		for (int i = 1; i <=number; i++) {
			if(number%i==0) {
				System.out.print((i==number)?i:i+",");//삼항연산자 사용
			}
		}
	}
}