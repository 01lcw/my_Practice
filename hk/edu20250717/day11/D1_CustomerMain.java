package hk.edu20250717.day11;

public class D1_CustomerMain {
	public static void main(String[] args) {
		D1_Customer customerLee=new D1_Customer(); //부모의 타입으로 부모 생성함
		customerLee.customerID=10001;
		customerLee.customerName="이순신";
		customerLee.bonusPoint=1000;
		customerLee.calcPrice(15000);
		System.out.println(customerLee.toString());
		
		//부모의 타입으로 부모 생성함
		D1_Customer customerLee2=new D1_Customer(10001,"이순신"); 
		customerLee.bonusPoint=1000;
		customerLee.calcPrice(15000);
		System.out.println(customerLee2.toString());
		
		//자식의 타입으로 자식을 생성
		D1_VIPCustomer customerKim=new D1_VIPCustomer(10002,"김유신",20001);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.toString());
		

	}
	
	
}
