package ExamChapter6_20_Teacher;

// 멤버 : 필드, 생성자, 메소드
public class Account { // 계좌정보

	// 필드
	private String ano; // 정보
	private String owner; // 주인
	private int balance; // 잔고

	// 생성자
	public Account(String ano, String owner, int balance) { // 외부의 값을 받는 역할
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// 생성자
	public String getAno() { 
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// Account 정보 출력 메소드
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}

}
