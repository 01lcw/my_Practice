package hk.edu20250715.day09;

//로또를 여러장 생성하여 저장하는 클래스
public class D2_LottoStore {
	
	//lottoStore[Lotto,Lotto,Lotto,Lotto,Lotto]
	private D2_Lotto[] lottoStore;
	
	public D2_LottoStore() {
		this(5);
	}
	
	public D2_LottoStore(int n) {
		this.lottoStore=new D2_Lotto[n];
		makeLotto();  
	}
	
	public void makeLotto() {
		//Lotto객체를 생성해서 lottoStore배열에 담기
		for (int i = 0; i < lottoStore.length; i++) {
			lottoStore[i]=new D2_Lotto();
		}
	}

	public D2_Lotto[] getLottoStore() {
		return lottoStore;
	}
	
	
}



