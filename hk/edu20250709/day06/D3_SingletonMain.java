package hk.edu20250709.day06;

public class D3_SingletonMain {
	public static void main(String[] args) {
		//참조타입끼리 형 변환
		D3_SingletonMain sm = new D3_SingletonMain();
		Object obj=sm; //Object가 부모이므로 더 큰 개념 --> 자동형변환
//		obj.test(); //형변환이 되어서 test() 사용 못 함
		D3_SingletonMain afterSm=(D3_SingletonMain)obj; // 작은 타입 <-- 큰 타입 : 형변환 문법사용
		afterSm.test(); //자신의 타입으로 다운캐스팅하면 자신의 메서드를 사용할 수 있다.
		
//		D1_ImmutableTest itest=sm;//관계없는 객체끼리는 형 변환X
		
		//기본타입과 참조타입 형 변환
		int a =10;
		Object obj2=a;// 참조타입 <--- 기본타입
		Integer ii=a;//중간 진행 과정
//		Integer iii=new Integer(a);
		Object obj3=ii;//참조타입끼리 형변환
		int b=(int)obj3;//int 기본타입으로 변환
		System.out.println(b);
		//싱글턴 패턴----------------------------
//		D3_SingletonTest st = new D3_SingletonTest();//실행못함
		//new를 못하면 객체를 어떻게 생성하고 기능은 또 어떻게 사용하는가
		D3_SingletonTest st = 
		D3_SingletonTest.getInstance(); //클래스명.메서드명 호출 가능
		
	}
	
	public void test() {
		
	}
}
