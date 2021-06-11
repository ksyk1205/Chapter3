package ch03;

public class VIPCustomer extends Customer {

	private int agentID;
	double salseRatio;
	
//	public VIPCustomer() {
//		
//		bonusRatio = 0.05;
//		salseRatio = 0.01;
//		customerGrade = "VIP";
//		
//		System.out.println("VIPCustomer() call");
//	}
	// super를 이용하여 상위 클래스의 생성자 명시적으로 호출
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		salseRatio = 0.01;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer(int,String) call");
		
	}

	public int getAgentID() {
		return agentID;
	}

}
