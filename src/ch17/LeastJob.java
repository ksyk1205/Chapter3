package ch17;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("��Ⱑ ���� �������� ����մϴ�.");
	}

}
