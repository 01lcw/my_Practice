package sp.D6;

public class ComputerMain {
	public static void main(String[] args) {
		Computer com=new Computer();
		
		System.out.println(com.sum(1,2,3,4,5));
		
		int[] a= {1,2,3,4,5};
		System.out.println(com.sum(a));
		
		System.out.println(com.sum(new int[] {1,2,3,4,5}));
	}
}
