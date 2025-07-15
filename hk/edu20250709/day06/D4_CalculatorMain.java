package hk.edu20250709.day06;

public class D4_CalculatorMain {

	public static void main(String[] args) {
		D4_CalculatorA cA = new D4_CalculatorA(10,20);
		cA.a();//연산 실행
		System.out.println(cA.getResult());
		
		int num1=50;
		int num2=20;
		String cal="/";
		
		D4_CalculatorCompare calcu= new D4_CalculatorCompare();
		calcu.calculator(num1, num2, cal);
		System.out.printf("%d와 %d의 %s 계산 결과는 %d \n",num1,num2,cal,calcu.getResult());
	}
}