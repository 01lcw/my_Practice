package hk.edu20250717.day11;

import java.util.Arrays;

import hk.edu20250721.day13.D1_EvenMagicSquare;

public class D3_MagicSquareMain {

	public static void main(String[] args) {
		D3_OddMagicSquare oddMagic=new D3_OddMagicSquare(3);
		oddMagic.make();
//		int [][] magic=oddMagic.magic;
//		for (int i = 0; i < magic.length; i++) {
//			for (int j = 0; j < magic.length; j++) {
//				System.out.print(magic[i][j]+"\t");				
//			}
//			System.out.println();
//		}
		oddMagic.magicPrint();
		
		System.out.println("=========짝수마방진(4배수)=============");
		D1_EvenMagicSquare evenMagic=new D1_EvenMagicSquare(10);
		evenMagic.magicPrint();
		
	}
}