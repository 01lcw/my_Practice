package hk.edu20250717.day11;

public class D1_VIPCustomer extends D1_Customer{
	
	//다시 동일한 내용을 작성할 필요 없이 부모의 멤버필드를 사용하면 된다.
//	private int customerID; //고객ID
//	private String customerName; //고객이름
//	private String customerGrade; //고객등급
//	private int bonusPoint; //보너스 포인트
//	private double bonusRatio;//보너스 적립률
	
	private int agentID; //담당 상담원 ID
	private double saleRatio; //할인율
	
	public D1_VIPCustomer() {
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	public D1_VIPCustomer(int customerID, String customerName, int agentID) {
		//부모의 생성자를 통해서 ID, Name 멤버필드 초기화
//		super(customerID, customerName);
		//부모의 멤버필드에 접근해서 초기화
		super.customerID=customerID;
		super.customerName=customerName;
		super.customerGrade="VIP";
		super.bonusRatio=0.05;
		
		this.saleRatio=0.1;
		this.agentID=agentID;
	}
	
	//부모의 calcPrice()와 자식의 calcPrice()는 내용이 다르게 구현되야 하기 때문에
	//부모의 메서드를 바로 쓸 수 없고, 새로 정의해야 된다.
	@Override
	public int calcPrice(int price) {
		//단축연산자: 자동형변환하여 대입됨
		bonusPoint=(int)(bonusPoint+price*bonusRatio);
		bonusPoint+=price*bonusRatio;//보너스 적립
		
		return price-(int)(price*saleRatio); //할인이 적용된 가격 반환
	}
	@Override
	public String toString() {
		return super.customerName+"등급: "+customerGrade+", " +bonusPoint;
	}
}