package ch14;

public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 = num2;
	}
	
	public void showInfo() {
		System.out.println("모두 구현했습니다.");
	}
	

}
