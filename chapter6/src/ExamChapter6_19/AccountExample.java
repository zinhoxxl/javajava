package ExamChapter6_19;

public class AccountExample {

	public static void main(String[] args) {

		Account1 account = new Account1(); // default ������

		account.setBalance(10000);
		System.out.println("�����ܰ�:" + account.getBalance());

		account.setBalance(-100); // �Ű����� �����϶�
		System.out.println("�����ܰ�:" + account.getBalance());

		account.setBalance(2000000); // �Ű����� �鸸�� �ʰ�
		System.out.println("�����ܰ�:" + account.getBalance());
		
		account.setBalance(300000); 
		System.out.println("�����ܰ�:" + account.getBalance());

	}

}

class Account1 {

	// �ʵ�
	private int balance; // balance = 0;
	final int MIN_VALUE = 0;
	final int MAX_VALUE = 1000000;

	// �ҷ�����
	public int getBalance() {
		return balance;
	}

	// ���� ����
	public void setBalance(int balance) { // �����ȿ��� ó��
		if(balance>=MIN_VALUE && balance<=MAX_VALUE)
		this.balance = balance; // ���� �ѱ�
	}

}




