package BankApplication_1020;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	private static final String DepositAmount = null;
	// List로 변경
	static List<Account> accountList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	static FileWriter fout=null;
	static String output;

	public static void main(String[] args) throws IOException {
	
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금|5.이체|6.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택>");

			int selectNo = scanner.nextInt();
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				transfer();
				break;
			case 6:
				FileWriter fout = new FileWriter("c:\\temp\\transfer.txt", true);
				fout.write(output);
				fout.close();
				
				
				run = false;
				break;
			}

		}
		System.out.println("프로그램 종료");

	}

	
	// 내가 하는 부분
	// 이체 1번계좌의 balance-=amount, 2번계좌의 balance+=amount;
	private static void transfer() {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm");
		String result = df.format(today); // 시간
		String line = scanner.nextLine();//한 줄 단위로 입력받기
		System.out.println("------");
		System.out.println("이체");
		System.out.println("------");
		System.out.print("보내는 계좌번호");
		String ano1 = scanner.next();
		System.out.print("받는 계좌번호");
		String ano2 = scanner.next();
		System.out.print("이체액");
		int amount = scanner.nextInt();
		if (findAccount(ano1) == null || findAccount(ano2) == null) {
			System.out.println("[ 이체 실패 ] %d 계좌번호를 확인하세요!");
		} else {
			Account a1 = findAccount(ano1);
			Account a2 = findAccount(ano2); // 보낸,받은 계좌를 a1,a2에 넣었고
			a1.setBalance(a1.getBalance() - amount);
			a2.setBalance(a2.getBalance() + amount);
		}
		System.out.printf("[ %d ]원이 [ %s ]에 %n 이체되었습니다.%n", amount, result);
		System.out.println("받으신분의 정보: "+ findAccount(ano2));
		System.out.println("고객님의 정보: "+ findAccount(ano1));
		
		output = "이체액:"+amount+"\n"+"시간"+result+"\n"+"받는이:"+findAccount(ano2)+"\n"+"보낸이(본인)"+findAccount(ano1);
	
	
	} 

	//내가 하는 부분
	
	
	
	
	
	
	
	
	
	
	// 계좌생성하기
	private static void createAccount() {
		
		int c;//
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("계좌주:");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();

		accountList.add(new Account(ano, owner, balance));
		System.out.println("결과:계좌가 생성되었습니다.");
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		//
		for (int i = 0, size = accountList.size(); i < size; i++) { // for문 실행할때 마다 accountList.size() 사용방지
			System.out.println(accountList.get(i));
		}

	}

	// 예금하기
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호");
		String ano = scanner.next();
		System.out.print("예금액");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
			System.out.printf("%d 원이 입금되었습니다.%n", amount);
		} else {
			System.out.println("결과:계좌번호를 확인해주세요.");
		}
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호");
		String ano = scanner.next();
		System.out.print("출금액");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);

		if (acc != null) {
			if (acc.getBalance() - amount >= 0) {
				acc.setBalance(acc.getBalance() - amount);
				System.out.printf("%d 원이 인출되었습니다.%n", amount);
			} else {
				System.out.println("결과:잔고가 부족합니다.");
			}
		} else {
			System.out.println("결과:계좌번호를 확인해주세요.");
		}
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기-
	private static Account findAccount(String ano) {
		Account account = null;// 로컬변수
		for (int i = 0; i < accountList.size(); i++) {
			account = accountList.get(i);
			if (account.getAno().equals(ano))
				break;
		}
		return account; 
	}
}