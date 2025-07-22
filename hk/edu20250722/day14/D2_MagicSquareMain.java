package hk.edu20250722.day14;

public class D2_MagicSquareMain {
	
	public static void main(String[] args) {
//		D2_IMagic magic=new D2_OddMagicSquare(5);
//		magic.make();
//		magic.magicPrint();
//		
//		D2_IMagic magic4=new D2_EvenMagicSquare(8);
//		magic4.make();
//		magic4.magicPrint();
		
		//sigleton pattern이라 메서드를 통해 객체를 얻어온다.
		//다형성 구현 : IMagic 타입으로 여러 객체를 참조하며, make(), print()를 통해
		//			 다양한 형태로 표현한다.
//		D2_MagicFactory fac = D2_MagicFactory.getInstance();
//		D2_IMagic magic = fac.factory();
//		magic.make();
//		magic.magicPrint();
		
		D2_MagicFactory fac = D2_MagicFactory.getInstance();
		D2_IMagic magic=fac.factory();
		if(magic==null) {
			System.out.println("다시 입력");
		}else {
			//magicRun(): 템플릿 메서드를 따로 클래스에 정의해서 구현
			D2_MagicUtil.magicRun(magic);
		}
	}
}