package hk.edu20250718.day12;

//추상클래스를 상속받으면 반드시 추상메서드를 구현해야 된다.
public class D1_DeskTop extends D1_Computer {
	
	public D1_DeskTop() {
		super();
	}
	@Override
	public void display() {
		System.out.println("DeskTop용 Display입니다.");
		
	}
	
	@Override
	public void typing() {
		System.out.println("DeskTop용 Typing입니다.");
		
	}
}
