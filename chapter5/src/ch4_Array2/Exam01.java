package ch4_Array2;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 과제!!
		// 1. id= "hong" , pwd = "1234"
		// id와 pwd를 scanner로 입력받아서 id와 pwd가 둘다 같으면 "login성공",
		// 아니면 "1회 실패하였습니다." 출력
		// 5회 실패하면, "5회 실패하였습니다. 프로그램을 종료 합니다" 출력 후 종료

		Scanner scanner = new Scanner(System.in);

		String id;
		String pwd;
		int cnt = 0;
		boolean run = true;

		while (run) {
			System.out.println("아이디와 패스워드를 입력하세요.");
			System.out.println("아이디> ");
			id = scanner.next();
			System.out.println("패스워드> ");
			pwd = scanner.next();

			cnt++;

			if (id.equals("hong") && pwd.equals("1234")) {
				System.out.println("login 성공");
				break;
			} else {

				if (cnt == 5) {
					System.out.println(cnt + "회 실패하였습니다. 프로그램을 종료합니다.");
					run = !run;

				} else {
					System.out.println(cnt + "회 실패하였습니다.");
				}

			}

		}

	}
}
