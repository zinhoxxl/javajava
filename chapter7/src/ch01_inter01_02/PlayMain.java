package ch01_inter01_02;

public class PlayMain {
	// �ʵ�
	// �������̽��� ���� �޼ҵ� ȣ�� ó�� - �� ������
	// ����ϴ� ��ü�� ����Ǿ ������Ĵ�� ���
	RemoteControl rc = new Television();
	
	
	public static void main(String[] args) {

		PlayMain p = new PlayMain();
		// ����ϴ� ��ü�� �����̵Ǿ �ҽ��ڵ� �������!!
		p.rc.turnOn();
		p.rc.setVolume(5);
		p.rc.turnOff();
	}
	
}
		
		
		
