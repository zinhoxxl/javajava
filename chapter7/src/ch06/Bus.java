package ch06;

public class Bus implements Vehicle {

	public void run() {
		System.out.println("������ �޸��ϴ�");
	}

	// �߰��� �޼ҵ�
	public void checkFare() {
		System.out.println("������� üũ");
	}
	
}

class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�");
	}

}