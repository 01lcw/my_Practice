package hk.edu20250710.day07;

import hk.edu20250708.day05.D1_ClassTest;

public class D1_StringMethodMain {
	public static void main(String[] args) {
		D1_StringMethodTest smt = new D1_StringMethodTest();
		String s=smt.sTest01("ABCDEF",2);
		System.out.println(s);
		
		smt.sTest2("ABCDEF");
		
		System.out.println(smt.sTest03("ABCD"));
		
		smt.sTest04();
		smt.sTest5("ABCDEFG");
		System.out.println("------------------------------------------");
		
		smt.search("카카오");
	}
}
 