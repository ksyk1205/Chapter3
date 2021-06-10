package ch02;

public class VIPCustomer extends Customer {

	private int agentID;
	double salseRatio;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salseRatio = 0.01;
		customerGrade = "VIP";
	}

	public int getAgentID() {
		return agentID;
	}

}
