package ch03;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("¿Ãº¯Ω≈");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020,"±Ë¿ØΩ≈");
//		customerKim.setCustomerName("±Ë¿ØΩ≈");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint=1000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
