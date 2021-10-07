package ExamChapter6_20_Teacher;

import java.util.Scanner;

public class BankApplication { // 계좌 저장소 생성 (main에서 사용 가능하게 static으로 생성)
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in); 
	private static int idx; // idx = 0;

	public static void main(String[] args) { // 메인시작
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금|5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");

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
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");

	} // 메인 종료

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();

		System.out.print("계좌주: ");
		String owner = scanner.next();

		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();

		Account acc = new Account(ano, owner, balance);
		accountArray[idx++] = acc;
		System.out.println("계좌가 생성되었습니다.");
	}

	// 계좌목록보기
	private static void accountList() {

		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.println(accountArray[i]);
				System.out.println();
			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();

		System.out.print("예금액: ");
		int amount = scanner.nextInt();

		Account account = findAccount(ano);

		if (account != null) {
			account.setBalance(account.getBalance() + amount);
			System.out.println("결과: 입금이 성공되었습니다.");
		}

		else {
			System.out.println("결과: 계좌가 없습니다.");

		}

	}

	// 출금하기
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();

		System.out.print("출금액: ");
		int amount = scanner.nextInt();

		Account account = findAccount(ano);
		if (account != null) {
			if (account.getBalance() - amount >= 0) {
				account.setBalance(account.getBalance() - amount);
				System.out.println("결과: 출금이 성공되었습니다.");
			} else {
				System.out.println("결과: 잔고가 부족합니다.");
			}

		} else {
			System.out.println("결과: 계좌가 없습니다.");
		}

	}
	// Account 배열에서 ano와 동일한 Account 객체 찾기-
	// 참조타입 배열의 값 비교
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			account = accountArray[i];
			if (account != null) {
				if (account.getAno().equals(ano))
					break;
			}
		}
		return account;
	}

}
