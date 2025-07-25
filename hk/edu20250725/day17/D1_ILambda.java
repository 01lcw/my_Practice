package hk.edu20250725.day17;

@FunctionalInterface
public interface D1_ILambda {
	
	//메서드는 하나만 선언해서 사용한다.
	public int add(int a, int b); //추상메서드
	
	//default 메서드, static 메서드, 함수형 정의 -> 람다식
//	default public int test() {
//		return 2;
//	}
}
