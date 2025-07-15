package com.hk.test;

import java.util.Arrays;

public class practice08 {
	public int [] Lotto;
	
	public practice08() {
		
		
		for (int i = 0; i < 6; i++) {
			Lotto[i]=(int)(Math.random()*45+1);
		}
		System.out.println(Lotto);
	}
	
}