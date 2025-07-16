package hk.edu20250715.day09;

import java.util.Arrays;

public class D2_LottoMain {

	public static void main(String[] args) {
		D2_Lotto lotto=new D2_Lotto();
//		lotto.makeLotto();//로또번호 생성해서 배열에 담는다
//		System.out.println(Arrays.toString(lotto.getLots()));

//		D2_Lotto[] lottostore=new D2_Lotto[]{new D2_Lotto(),
//										     new D2_Lotto(),
//										     new D2_Lotto(),
//										     new D2_Lotto(),
//										     new D2_Lotto()};
		
		D2_LottoStore lottoStore=new D2_LottoStore(5);
		D2_Lotto[] lottostore=lottoStore.getLottoStore();

		for (int i = 0; i < lottostore.length; i++) {
			System.out.println(Arrays.toString(lottostore[i].getLots()));
		}//for종료
		
		D2_LottoCompare lottoCom=new D2_LottoCompare();
		lottoCom.compareBall();
		
	}
	
}