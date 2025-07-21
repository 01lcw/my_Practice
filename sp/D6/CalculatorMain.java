package sp.D6;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.PowerOn();
		int result1= cal.plus(8, 4);
		System.out.println(result1);
		double result2 = cal.divide(8, 4);
		System.out.println(result2);
		cal.PowerOff();
	}
}
