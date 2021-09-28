package ExampleTestChaper4;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {

		boolean run = true; // 반복을 위한 조건 (반복 처리시 조건문확인 변수)
		int balance = 0; // 잔고 (현재금액 변수)
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");

			int menuNum = scanner.nextInt();

			switch (menuNum) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고>");
				System.out.println(balance);
				break;
			case 4:
				run = false; // 또는 run = !run
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
