package solopractice;

public class D6_KoreanExample {
	public static void main(String[] args) {
		D6_Korean k1 = new D6_Korean("이름", "123456-123456");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		D6_Korean k2 = new D6_Korean("성명", "654-654");
		
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}
