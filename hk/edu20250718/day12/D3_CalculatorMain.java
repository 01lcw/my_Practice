package hk.edu20250718.day12;

public class D3_CalculatorMain {
	
	public static void main(String[] args) {
		D3_ICalc calc = new D3_CalculatorChild();//인터페이스 타입으로 생성
		D3_Calculator calc2=new D3_CalculatorChild();
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.divide(39, 0));
//		calc.showInfo();//호출 못함 --> 자식타입으로 캐스팅을 해야 사용가능
		D3_CalculatorChild cc=(D3_CalculatorChild)calc;
		cc.showInfo();//캐스팅하면 호출됨
	}
}
