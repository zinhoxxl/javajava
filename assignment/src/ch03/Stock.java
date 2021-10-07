package ch03;

import java.util.Arrays;

public class Account {

	// 필드
	static final String bankNo = "111";
	static int seq = 0;
	private String ano;
	private String owner;
	private int balance;

	{
		seq++;
		ano = bankNo + "-" + seq + seq + seq;
	}

	// 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// 메소드
	public static int getSeq() {
		return seq;
	}

	public static void setSeq(int seq) {
		Account.seq = seq;
	}

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

	public static String getBankno() {
		return bankNo;
	}

}
