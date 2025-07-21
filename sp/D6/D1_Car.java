package sp.D6;

public class D1_Car {
	//필드 선언
	int gas;
	
	//리턴값이 없는 메소드로 매개값을 받아서 gas 필드 값으로 변경
	void setGas(int gas) {
		this.gas=gas;
	}
	
	//리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
	boolean isLeftgas() {
		if(gas==0) {
			System.out.println("gas 없음");
			return false;
		}
		System.out.println("gas 있음");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달림(gas잔량:"+gas+")");
				gas-=1;
			}
			else {
				System.out.println("멈춥니다. (gas잔량"+gas+")");
				return;
			}
		}
	}
}
