package ch07_initialBlock;

public class Init3Ex {

	public static void main(String[] args) {

		System.out.println("�ʱ�ȭ �׽�Ʈ");
		Block b1 = new Block();
		Block b2 = new Block();
		Block b3 = new Block();

	}

}

// ������� 1.static�ʱ�ȭ 2.�ν��Ͻ��ʱ�ȭ 3.������  ��, static�� �ν��Ͻ����� ������
class Block {
	{ // �ν��Ͻ� �ʱ�ȭ ��
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
	}
	// static�� Ư�� - uniqueƯ�� (���� Ŭ���� �ε�� �ѹ��� ����)
	static { // static�ʱ�ȭ ��
		System.out.println("Ŭ����(static) �ʱ�ȭ ��");
	}

	// ������
	Block() {
		System.out.println("������");
	}
}