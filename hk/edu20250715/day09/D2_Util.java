package hk.edu20250715.day09;

public class D2_Util {
	public static boolean isSame(int[] a, int b) {
		boolean isS=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b) {
				isS=true;
				break;
			}
		}
		return isS;
	}
	public static void lottoResultPrint(int count) {
		switch(count) {
		case 6:System.out.println("1등"); break;
		case 5:System.out.println("2등"); break;
		case 4:System.out.println("3등"); break;
		case 3:System.out.println("4등"); break;
		case 2:System.out.println("5등"); break;
		default:System.out.println("다음 기회에!!!^^"); break;
		
		}
	}
}
