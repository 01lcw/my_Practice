package hk.edu20250708.day05;

public class D3_Constructor {
	
	//티비 객체
	private int size =0;//중요한 데이터 -> private로 선언
	public String color ="검정색"; //색상 관리 멤버 필드
	
	//default 생성자: 단독으로 사용한다면 생략이 가능 --> 오버로딩을 하면 생략 못함
	//생성자를 호출할 때는 반드시 첫 줄에 작성해야 함
	public D3_Constructor() {
		//super();//부모생성자 호출 --> super(), this() 둘 다 생성자를 호출하기 때문에 첫 줄에 작성해야함
		this(60);//반복 코드를 주이기 위해 this() 사용하기도 함
		this.size=60;
	}
	
	public D3_Constructor(int size) {
		super();//super(), this() 같이 사용할 수 없다.
 		this.size=size;
	}
	
	public D3_Constructor(int size, String color) {
		this.size=size;
		this.color=color;
	}
	
	//값을 가져오는 메서드
	public int getSize() {
		return size;
	}
		
//	public int getSize(int pw) {
////		if(pw==100) { //size를 가져오기 위해서는 pw에다가 100을 넣어야 한다.
////		return size;
////		}
////		else {
////			return 0;
////		}
//		return size;
//	}
	//값을 저장하는 메서드
	public void setSize(int size) {
		this.size=size;
	}
}