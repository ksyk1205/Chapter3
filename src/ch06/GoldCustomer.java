package ch06;

public class GoldCustomer extends Customer {
	
	double salseRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		salseRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "GOLD";
	}
	
	public int calPrice(int price) {
		bonusPoint += price * salseRatio;
		return price = (int)(price*salseRatio);
	}

}
