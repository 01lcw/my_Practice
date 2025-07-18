package hk.edu20250718.day12;

public class D1_ComputerMain {
	public static void main(String[] args) {
		//추상클래스는 객체생성을 할 수 없다.(new 이용X)
//		D1_Computer computer = new D1_Computer(); (X) 
		
		D1_Computer deskTop = new D1_DeskTop();
		deskTop.turnOn();
		deskTop.display();
		deskTop.typing();
		deskTop.turnOff();
		
//		D1_Computer myNoteBook=new D1_NoteBook();//추상클ㄹ스라 생성 못함
		D1_Computer myNoteBook=new D1_MyNoteBook();
		myNoteBook.turnOn();
		myNoteBook.display();
		myNoteBook.typing();
		myNoteBook.turnOff();
	}
}
