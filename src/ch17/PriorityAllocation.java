package ch17;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�켱������ ���� ���켱 ���õ� ���� �������� ����մϴ�.");
	}

}
