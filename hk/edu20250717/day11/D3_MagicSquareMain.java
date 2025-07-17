package hk.edu20250717.day11;

import java.util.Arrays;

public class D3_MagicSquareMain {
	
	public static void main(String[] args) {
		D3_OddMagicSquare oddMagic=new D3_OddMagicSquare(5);
		oddMagic.make();
		int [][] magic=oddMagic.magic;
		for (int i = 0; i < magic.length; i++) {
			for (int j = 0; j < magic.length; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();
		}
		oddMagic.check();
		System.out.println();
	}
	
	
}