package ExamChapter6_02_07;

public class SnowTireExample {

	public static void main(String[] args) {

		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;

		snowTire.run(); // �ڽ����� ȣ��
		tire.run(); // �θ�� ȣ��
	}
}

class Tire { // �θ�

	public void run() {
		System.out.println("�Ϲ�Ÿ�̾ �������ϴ�");
	}
}

class SnowTire extends Tire {
	@Override
	public void run() { // run�� ������
		System.out.println("����� Ÿ�̾ �������ϴ�");
	}

}
