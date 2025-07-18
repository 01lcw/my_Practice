package sp.D6;

public class D1_CarMain {
	public static void main(String[] args) {
		D1_Car car=new D1_Car();
		car.setGas(10);
		if(car.isLeftgas()) {
			System.out.println("출발합니다");
			
			car.run();
		}
		
		System.out.println("gas주입 필요");
	}
}