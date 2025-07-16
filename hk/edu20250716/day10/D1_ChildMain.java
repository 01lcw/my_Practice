package hk.edu20250716.day10;

import hk.edu20250715.day09.D2_Lotto;

public class D1_ChildMain {
	public static void main(String[] args) {
		
		D1_Child child = new D1_Child();//자식의 타입으로 자식을 생성
				 int a=child.a;//부모의 멤버필드 a
				 child.childMethod(); //자식의 메서드 사용
				 child.parentMethod();//부모의 메서드 사용
				 
		D1_Parent parent=new D1_Child();
//		D1_Parent pp=new D2_Lotto(); //(x) 클래스간에 아무런 관계가 없음
		
					int aa=parent.a;
					parent.parentMethod();//부모의 메서드를 호출하면 자식이 호출됨
//					parent.childMethod(); //(x)설계도에 공개된 메서드만 사용 가능
		//test(new D1_Child())   parentM(){"A"출력}
		//test(new D1_Child2())  parentM(){"B"출력}
		test(new D1_Child());
		
		//toString() 오버라이딩함
		System.out.println(child);
	}
	//main 메서드
	//자바의 다형성
	public static void test(D1_Parent obj) {
		obj.parentMethod();	//obj에 어떤 자식객체를 받느냐에 따라 parentM()가 다르게 실행된다(다양한 형태로)
		
		//자식객체에 정의된 childMethod()를 사용하려면 형변환해야 된다.
		if(obj instanceof D1_Child) {
			D1_Child ch=(D1_Child)obj;//자식타입으로 형변환해야
			ch.childMethod();         //자식 메서드 사용가능
									  //설계도에 공개된 메서드만 사용가능
		}
	}
}
