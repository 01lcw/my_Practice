package sp.D6;

public class D3_thisCar {
	String model;
	int speed;
	
	D3_thisCar(String model){
		this.model=model;
	}
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
	void run() {
		setSpeed(100);
		System.out.println(model+"\t"+speed);
	}
	
}