package ch01;

import java.util.Scanner;

public class BodyPerCalcExam {

	public static void main(String[] args) {

		boolean run = true;
		String gender;
		String con;
		int age = 0;
		int weight = 75;
		int height = 175;

		Scanner scanner = new Scanner(System.in);

		System.out.println("1번부터 순서대로 입력하세요!");

		while (run) {

			System.out.println("----------------------------------");
			System.out.println("1.성별 |2.나이 |3.키 |4.몸무게 |5.결과");
			System.out.println("----------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
			if (selectNo > 5) {
				System.out.println("선택지 안에서 번호를 골라주세요");
			}

			switch (selectNo) {
			case 1:
				System.out.println("성별을 입력하세요.(남자 또는 여자)");
				System.out.print("입력>");
				gender = scanner.next();
				break;

			case 2:
				System.out.println("나이를 입력하세요.");
				System.out.print("입력>");
				age = scanner.nextInt();
				break;

			case 3:
				System.out.println("키를 입력하세요.");
				System.out.print("입력>");
				height = scanner.nextInt();
				break;

			case 4:
				System.out.println("몸무게를 입력하세요.");
				System.out.print("입력>");
				weight = scanner.nextInt();
				break;

			case 5:
				final double ST1 = 1.10;
				final double ST2 = 128;

				// 제지방량
				double result = ST1 * weight - ST2 * ((weight * weight) / (double) (height * height));
				System.out.println("제지방량: [" + Math.round(result) + "kg] 입니다");

				// 체지방량
				double result2 = weight - result;

				System.out.println("체지방량: [" + Math.round(result2) + "kg] 입니다");

				// 체지방률 구하기 = 체지방량*100/체중
				final double ST3 = 100;

				double result3 = result2 * ST3 / weight;

				System.out.println("체지방률: [" + Math.round(result3) + "%] 입니다.");
				System.out.println();

				System.out.println("계속하시려면 yes, 종료하시려면 no를 입력하세요.");
				con = scanner.next();

				if (con == "yes") {
					System.out.println("다시 시작합니다.");
					continue;
				}
				if (con == "no") {

					break;

				}
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
			

		} 
	}

}
