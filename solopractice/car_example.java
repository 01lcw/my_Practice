package solopractice;

public class car_example {

	public static void main(String[] args) {
		car mycar= new car("dd",20);
		System.out.println("첫번째 차: "+mycar.model+mycar.maxspeed+mycar.color+mycar.minspeed);
		
		car mycar2 = new car("노랑",500);
		System.out.println("첫번째 차: "+mycar2.model+mycar2.maxspeed+mycar2.color+mycar2.minspeed);

}
}