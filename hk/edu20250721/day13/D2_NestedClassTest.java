package hk.edu20250721.day13;

public class D2_NestedClassTest {
	public static void main(String[] args) {
		StaticInnerClass sIc=new StaticInnerClass("정적내부클래스");
		System.out.println(sIc.getResult());
		InnerClass inner = new D2_NestedClassTest()
						.new InnerClass("내부클래스");		
		System.out.println(inner.getResult());
		//익명클래스: 인터페이스로 구현할 때 그 위치에서 메서드 등을 구현
		D2_Anonymous anonymous = new D2_Anonymous() {
			
			@Override
			public void anonyMethod() {
				
			}
			@Override
			public void anonyMethod2() {
				
			}
		};
		
	}
	
	public int a=5;
	public int b=10;
	public static int aa=7;
	public static int bb=3;
	
	//정적 내부 클래스: 독립적으로 사용가능
	static class StaticInnerClass{
		public String message;
		
		public StaticInnerClass(String message) {
			this.message=message;
		}
		
		public int getResult() {
//			int result=a+b;//static 필드만 접근 가능하다.
			int result=aa+bb;
			return result;
		}
		
	}
	
	//인스턴스 내부 클래스: 외부 클래스를 객체 생성해야 사용 가능
	class InnerClass{
		public String message;
		
		public InnerClass(String message) {
			this.message=message;
		}
		
		public int getResult() {
			int result = a+b;
			return result;
		}
		
		public void nestedMethod() {
			int c=5; //메서드의 변수
			class LocalInnerClass{
				public int number;
				public LocalInnerClass(int number) {
					this.number=number;
				}
				public int getLic() {
					int ss=c; //메서드의 변수에 접근
					return ss+number;
				}
			}   //지역 내부 클래스 종료
//			c=50;//값이 변경되는 코드가 있다면..
			LocalInnerClass licObj=new LocalInnerClass(100);
			System.out.println("지역내부클래스: "+licObj.getLic());
		}//메서드 종료
	}
}
