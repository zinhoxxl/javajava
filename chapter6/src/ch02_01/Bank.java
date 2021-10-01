package ch02_01;

// ������� Ŭ����(���赵)
public class Bank {
	// �����ܰ� �ݾ� �ʵ�
	private int balance = 0;

	// �Ա� ���
	public void deposit(int amount) {
		balance += amount;
	}

	// ���
	public void withdraw(int amount) {
		if (balance - amount >= 0)
			balance -= amount;
	}

	// �ܰ� ���
	public void currentBalance() {
		System.out.println("�ܰ�:" + balance);
	}

}
