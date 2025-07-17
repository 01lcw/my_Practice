package sp.D6;

public class Calculator {
	void PowerOn() {
		System.out.println("전원 on");
	}
	void PowerOff() {
		System.out.println("전원 off");
	}
	
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
}
