package hk.edu20250718.day12;

public abstract class D3_Calculator implements D3_ICalc {

	@Override
	public int add(int num1, int num2) {
		return (num1+num2);
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}

	//나머지 2개의 기능은 현재 클래스에서 구현하기 힘든 상황..
	@Override
	public abstract int times(int num1, int num2);

	@Override
	public abstract int divide(int num1, int num2);

}
