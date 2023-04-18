package study08;

public class Customer {
	static int seqNum = 1000;
	
	
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerId = seqNum++;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String getCustomerInfo() {
		return "이름 : " + customerName + " | 등급 : "+ customerGrade + " | 보너스포인트 : " + bonusPoint;
	}
	
	public Customer(String customerName) {
		this();
		this.customerName = customerName;
	}
	
	
	
	
	
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int custmerId) {
		this.customerId = custmerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String custmerName) {
		this.customerName = custmerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String custmerGrade) {
		this.customerGrade = custmerGrade;
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
