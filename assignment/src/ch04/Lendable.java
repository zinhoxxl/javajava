package ch04;

public interface Lendable {

	// ��� -flag: ����ǥ��
	int BORROWED = 1; // ����
	int NORMAL = 0; // �̴���
	
	// �뿩 �޼ҵ�
	void checkOut(String name, String date);
	// �ݳ� �޼ҵ�
	void checkIn();
	
}

