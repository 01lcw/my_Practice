package hk.edu20250725.day17;

public class D1_LambdaTest {
	
	//내부에도 인터페이스를 만들 수 있다.
	@FunctionalInterface
	public interface D1_IinnerLambda{
		//함수형 인터페이스는 메서드 하나만 정의 가능
		public int add(int a);
	}
	
	public static void main(String[] args) {
		//익명클래스방식
		D1_ILambda lam = new D1_ILambda() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		
		System.out.println(lam.add(5, 10));
		
		//람다식으로 구현: 코드를 간결하게 작성할 수 있다.
		D1_ILambda lamFunc=(a,b)->{return a+b;};
		D1_ILambda lamFunc2=(a,b)->a+b; //return, 중괄호 생략 가능
		D1_ILambda lamFunc3=(a,b)->{System.out.println(a);return a+b;}; //여러줄은 생략X
		lamFunc3.add(20, 30);
		
		D1_IinnerLambda innerLam =a-> {
			System.out.println(a);
			return a+10;
		};
		
		innerLam.add(10);
	}
}