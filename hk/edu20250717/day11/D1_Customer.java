package hk.edu20250717.day11;

public class D1_Customer {
	
	//protected 접근제한자: 상속관계일 경우 public, 아닌경우 default로 사용된다.
	protected int customerID; //고객ID
	protected String customerName; //고객이름
	protected String customerGrade; //고객등급
	protected int bonusPoint; //보너스 포인트
	protected double bonusRatio;//보너스 적립률
	
	//default생성자: 나중에 ID,Name 값을 따로 추가해야 된다.
	public D1_Customer() {
		customerGrade="SILVER";
		bonusRatio=0.01;
	}

	//ID와 Name을 바로 추가할 수 있다.
	public D1_Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	
	//보너스 적립률 계산해서 보너스 포인트 추가
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price;
	}

//	@Override
//	public String toString() {
//		return "D1_Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
//				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
//	}
	
	
	@Override
	public String toString() {
		
		return customerName+"님의 등급은 "+customerGrade+"이며, "
				+ "보너스 포인트는"+bonusPoint+"입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
}
