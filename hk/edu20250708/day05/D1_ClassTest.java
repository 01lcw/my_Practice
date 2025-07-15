package hk.edu20250708.day05;

public class D1_ClassTest {
	//멤버필드: 클래스에서 데이터를 저장해서 사용하는 변수 개념
	public int number; //인스턴스 변수
	public static int staticNumber; //클래스 변수
	
	//기본생성자(default생성자): 파라미터 없음, 생략가능, 클래스의 초기화 작업
	//                      객체를 생성할 때 딱 한번만 실행
	public D1_ClassTest() {
		//super:부모, this: 자기자신 클래스
		super(); //<--Object의 생성자를 호출함
		//초기화 코드 작성
		this.number=5; //this: 자기 자신(현재 클래스)
//		int number =10;
//		number =10;
		System.out.println("default생성자 실행");
	}
	//생성자 오버로딩:
	//오버로딩이란?
	public D1_ClassTest(int n) {
		
	}
	public D1_ClassTest(int n, int m) {
		
	}
	
	//메서드: 인스턴스 메서드
	public void methodTest() {
		System.out.println("클래스 관련 기능을 정의한다.");
	}
	//메서드: 클래스 메서드
	public static void staticMethodTest() {
		System.out.println("static(메서드영역메모리)에 생성되어 공통기능 정의한다.");
	}

	public static void main(String[] args) {
		
	}
	
	@Override
	public String toString() {
		return "D1_ClassTest [number=" + number + "]";
	}

}
