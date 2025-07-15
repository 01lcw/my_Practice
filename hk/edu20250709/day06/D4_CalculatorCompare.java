package hk.edu20250709.day06;

public class D4_CalculatorCompare {
	
	//은닉화(캡슐화)
	private int result; //연산경과
	
	//           파라미터 : 연산할 숫자 2개, 연산자: "+","-","/","*"
	public void calculator(int num1, int num2, String cal) {
		//분기 형태로 실행하기 -> if문
		//전달받는 파라미터 중 타입이 String(문자열)이다.
		//--> 문자열을 비교하려면 equals()사용
		if(cal.equals("+")) {
			D4_CalculatorA calA = new D4_CalculatorA(num1, num2);
//			calA.num1=num1; 
//			calA.num2=num2;//생성자에서 초기화작업을 해준다.
			calA.a();
			this.result=calA.getResult();//은닉화: 필드 숨김 --> 메서드 통해 접근
		}else if(cal.equals("-")) {
			D4_CalculatorB calB = new D4_CalculatorB(num1, num2);
			calB.a();
			this.result = calB.getResult();
		}else if(cal.equals("/")) {
			D4_CalculatorC calC = new D4_CalculatorC(num1, num2);
			calC.a();
			this.result = calC.getResult();
		}else if(cal.equals("*")) {
			D4_CalculatorD calD = new D4_CalculatorD(num1, num2);
			calD.a();
			this.result = calD.getResult();
		}else {
			System.out.println("입력된 연산자는 지원하지 않습니다.");
		}
	}
	//은닉화된 필드의 값을 가져온다.
	public int getResult() {
		return result;
	}
}