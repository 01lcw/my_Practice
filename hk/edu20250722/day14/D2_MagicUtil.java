package hk.edu20250722.day14;

public class D2_MagicUtil {
	
	//템플릿메서드
	public static void magicRun(D2_IMagic magic) {
		magic.make();
		magic.magicPrint();
	}
}
