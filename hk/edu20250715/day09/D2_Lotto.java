package hk.edu20250715.day09;

//Lotto클래스 --> 로또 한장
public class D2_Lotto {

	//번호 6개가 저장될 배열
	private int [] lots;//배열선언
	
	//생성자: 클래스의 멤버필드를 초기화
	public D2_Lotto() {
//		this.lots = new int[6];
//		makeLotto();
		this(6);//생성자마다 중복코드 제거를 위해 this()를 사용함
	}

	//생성자 오버로딩
	public D2_Lotto(int n) {
		this.lots = new int[n];
		makeLotto();
	}
	
	//1~45까지 숫자를 랜덤하게 생성하는 메서드
	public int makeBall() {
		//Math클래스에 구현되어 있는 random()활용해 보자
		//random() 기능: 0~1사이에 실수를 반환--> 0.0000..1 ~0.9999..
		//0.999999*45 --> 1*45=45 -> 44.99999 ->0~44+1=1~45
		return (int)(Math.random()*45)+1;
	}
	
	//배열에 중복 숫자가 있는 지 판별하는 메서드
	//판별: 반환타입 boolean
	//배열과 숫자 하나에 대해 같은 숫자가 있는지 비교
	public boolean isSame(int[] a, int b) {
		boolean isS=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b) {
				isS=true;
				break;
			}
		}
		return isS;
	}
	//배열에 로또 번호 6개를 넣어주는 메서드
	//중복 숫자가 있으면 배열에 넣는 작업을 다시 해야 되니깐
	// --> 몇번 반복할지 코드로 구현하기 어렵다 : for문--> while문 사용
	public void makeLotto() {
		//while사용시 주의사항: 반복문을 빠져나가는 코드가 필요
		//--> 배열에 6개에 숫자가 저장되면 작업종료
		int count=0;
		while(count<lots.length) {
			int b=makeBall();//랜덤숫자 생성
			if(!isSame(lots, b)) {//중복숫자 확인
				lots[count++]=b;//배열에 숫자 저장					
			}
		}
		
	}

	//getter메서드: 은닉화(캡슐화)했을때 메서드를 통해 값에 접근
	public int[] getLots() {
		return lots;
	}
	
}





