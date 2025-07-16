package hk.edu20250715.day09;

import java.util.Arrays;

public class D2_LottoCompare {
	//추첨 번호
	public D2_Lotto lottoBall;	// 생성하면 멤버필드에 [1,20,25,30,31,40]
	
	//구매한 번호(사용자 로또번호)
	public D2_LottoStore userBall; // 생성하면 멤버필드에 [Lotto,Lotto..]
	
	//생성자
	public D2_LottoCompare() {
		this.lottoBall=new D2_Lotto();
		this.userBall=new D2_LottoStore(); // 기본 5장 생성
	}
	//생성자 오버로딩
	public D2_LottoCompare(int n) {
		this.lottoBall=new D2_Lotto();
		this.userBall = new D2_LottoStore(n);
	}
	//당첨번호를 확인하는 메서드
	public void compareBall() {
		//추첨번호 출력
		 System.out.println("추첨번호");
		 int[] lots=this.lottoBall.getLots(); //Lotto 객체에 멤버필드에 접근[1,4,6,7,8,9]
		 Arrays.sort(lots); // 정렬
		 System.out.println(Arrays.toString(lots));
		 
		 //구매자 번호 출력
		 System.out.println("구매자 번호");
		 D2_Lotto[] userLots = userBall.getLottoStore(); //[Lotto,Lotto,Lotto,Lotto...]
		 for (int i = 0; i < userLots.length; i++) {
			Arrays.sort(userLots[i].getLots());
			System.out.println(Arrays.toString(userLots[i].getLots()));
		}
		 
		 //당첨번호 확인하기
		 //[1,2,3,4,5,6] -> [10,11,12,13,14,15]
		 //				    [16,17,18,19,20,21]
		 for (int i = 0; i < userLots.length; i++) {
			 int count=0;
			 System.out.println(Arrays.toString(userLots[i].getLots()));
			for (int j = 0; j < lots.length; j++) {
				if(D2_Util.isSame(userLots[i].getLots(),lots[j])) {
					System.out.print(lots[j]+" "); //당첨 번호 출력
					count++;
				}
			}
			System.out.println("당첨번호 개수: "+count);
			D2_Util.lottoResultPrint(count);
			System.out.println("-----------------------------");
		} 
	}
}


	//당첨번호 확인 메서드 구현 시 본인이 필요하다고 생각하는 기능 정의
	
	//아래 메서드들은 Util클래스에 static메서드로 구현함.. 여러 클래스에서 사용될 가능성이 있음
	//배열에 중복 숫자가 있는지 체크
//	public boolean isSame(int[] a, int b) {
//		boolean isS=false;
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]==b) {
//				isS=true;
//				break;
//			}
//		}
//		return isS;
//	}
//	
//	//당첨 개수를 확인해서 해당 등수를 출력하는 기능
//	public void lottoResultPrint(int count) {
//		switch(count) {
//		case 6:System.out.println("1등"); break;
//		case 5:System.out.println("2등"); break;
//		case 4:System.out.println("3등"); break;
//		case 3:System.out.println("4등"); break;
//		case 2:System.out.println("5등"); break;
//		default:System.out.println("다음 기회에!!!^^"); break;
//		
//		}
//	}
//}
