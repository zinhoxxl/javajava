package ch07_staticVsnontStatic;

public class Fruits {

	// �ʵ�
	// static
	static int currentAmount = 100;
	// non-static
	int amount;

	// ������
	Fruits(int amount) {
		this.amount = amount;
		currentAmount = amount;
	}

}
