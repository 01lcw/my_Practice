package hk.edu20250709.day06;

//나눗셈 기능의 클래스
public class D4_CalculatorC {
	
	
	//계산할 값 2개를 저장할 멤버필드
	public int num1;
	public int num2;
	//계산결과를 저장할 멤버필드
	//계산결과는 중요한 값이라 외부에서 쉽게 접근해서 변경하면 안됨
	private int result;
	
	//getter메서드: private 필드에 접근하여 값을 가져오는 메서드	 sorce -> getter and setter
	public int getResult() {
		return result;
	}

	//default 생성자
	public D4_CalculatorC() {
//		this.num1=10;
//		this.num2=5;
		this(10,5);//반복적인 코드는 this생성자를 이용해서 줄이자
	}
	
	//생성자 오버로딩
	public D4_CalculatorC(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	//기능 정의: 덧셈연산기능 구현
	public void a() {
		this.result=this.num1/this.num2;
	}
}