package hk.edu20250709.day06;

public class D3_SingletonTest {
	
	//객체를 한 번만 생성해서 사용하자 --> 메모리 효율적 사용
	//static을 붙인 이유는 getInstance메서드가 static이므로
	private static D3_SingletonTest st; 
	private D3_SingletonTest() {	} //private 접근제한자 활용 -> new를 못함
	public static D3_SingletonTest getInstance() {
		if(st==null) {//객체가 생성되지 않았을 때
			st=new D3_SingletonTest(); // 객체 생성
		}
		return st;
	}
}