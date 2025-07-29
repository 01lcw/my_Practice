package hk.edu20250729.day19;

public class D1_CakeEater implements Runnable{
	
	private D1_CakePlate cake;
	
	public D1_CakeEater() {}
	public D1_CakeEater(D1_CakePlate cake) {
		this.cake=cake;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++) {
			cake.eatBread();
		}
	}
}
