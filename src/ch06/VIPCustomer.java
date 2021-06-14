package ch06;

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
	// super�� �̿��Ͽ� ���� Ŭ������ ������ ��������� ȣ��
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		salseRatio = 0.01;
		customerGrade = "VIP";
	
		
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price +bonusRatio;
		price -= (int)(price * salseRatio);
		return super.calcPrice(price);
	}

	public int getAgentID() {
		return agentID;
	}

}
