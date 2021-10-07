package ExamChapter6_19;

public class AccountExample {

	public static void main(String[] args) {

		Account1 account = new Account1(); // default 생성자

		account.setBalance(10000);
		System.out.println("현재잔고:" + account.getBalance());

		account.setBalance(-100); // 매개값이 음수일때
		System.out.println("현재잔고:" + account.getBalance());

		account.setBalance(2000000); // 매개값이 백만을 초과
		System.out.println("현재잔고:" + account.getBalance());
		
		account.setBalance(300000); 
		System.out.println("현재잔고:" + account.getBalance());

	}

}

class Account1 {

	// 필드
	private int balance; // balance = 0;
	final int MIN_VALUE = 0;
	final int MAX_VALUE = 1000000;

	// 불러오기
	public int getBalance() {
		return balance;
	}

	// 값을 저장
	public void setBalance(int balance) { // 범위안에서 처리
		if(balance>=MIN_VALUE && balance<=MAX_VALUE)
		this.balance = balance; // 값을 넘김
	}

}




