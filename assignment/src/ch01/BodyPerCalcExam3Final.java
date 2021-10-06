package ch01;

import java.util.Scanner;

public class BodyPerCalcExam3Final {

	public static void main(String[] args) {

		boolean run = true;
		String gender;
		String con;
		int age = 0;
		int weight = 0;
		int height = 0;
		int selectNo = 0;

		System.out.println("체지방량구하기~ 순서대로 작성해주세요");
		System.out.println();
		System.out.println("--------------------------"); // 강사님은 println 다음에 바로 값을 scanner에 저장함
		System.out.println("1.성별 |2.나이 |3.키 |4.몸무게");
		System.out.println("--------------------------");
		System.out.println();

		Scanner scanner = new Scanner(System.in);

		while (run) {
			gender = scanner.next();
			System.out.println("시작하시려면 1을 입력하세요");
			selectNo = 0;
			selectNo = scanner.nextInt();
			if (selectNo != 1) {
				continue;
			}

			switch (selectNo) {
			case 1:
				System.out.println();
				System.out.println("시작합니다");
				System.out.println("성별을 입력하세요.(남자 또는 여자)");
				System.out.print("입력>");

				gender = scanner.next();
				System.out.println();

			case 2:
				System.out.println("나이를 입력하세요.");
				System.out.print("입력>");

				age = scanner.nextInt();
				System.out.println();

			case 3:
				System.out.println("키를 입력하세요.");
				System.out.print("입력>");

				height = scanner.nextInt();
				System.out.println();

			case 4:
				System.out.println("몸무게를 입력하세요.");
				System.out.print("입력>");

				weight = scanner.nextInt();
				System.out.println();

			case 5:
				final double ST1 = 1.10, ST11 = 1.07;
				final double ST2 = 128;

				System.out.println("결과>");
				System.out.println();

				// 남자
				if (gender.equals("남자")) {
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

					if (result3 < 12) {
						System.out.println("  " + "[ 야윈체형 입니다 ]" + "  ");
					} else if (result3 >= 12 && result3 <= 17) {
						System.out.println("  " + "[ 표준체형 입니다 ]" + "  ");
					} else if (result3 >= 18 && result3 <= 22) {
						System.out.println("  " + "[ 과체중 입니다 ]" + "  ");
					} else if (result3 >= 23 && result3 <= 27) {
						System.out.println("  " + "[ 비만 입니다 ]" + "  ");
					} else
						System.out.println("[ 고도비만 입니다 ]");
				}

				// 여자
				if (gender.equals("여자")) {
					// 제지방량
					double result = ST11 * weight - ST2 * ((weight * weight) / (double) (height * height));
					System.out.println("제지방량: [" + Math.round(result) + "kg] 입니다");

					// 체지방량
					double result2 = weight - result;

					System.out.println("체지방량: [" + Math.round(result2) + "kg] 입니다");

					// 체지방률 구하기 = 체지방량*100/체중
					final double ST3 = 100;

					double result3 = result2 * ST3 / weight;

					System.out.println("체지방률: [" + Math.round(result3) + "%] 입니다.");
					System.out.println();

					if (result3 < 22) {
						System.out.println("  " + "[ 야윈체형 입니다 ]" + "  ");
					} else if (result3 >= 22 && result3 <= 27) {
						System.out.println("  " + "[ 표준체형 입니다 ]" + "  "); // bodyFatRatio <=27
					} else if (result3 >= 28 && result3 <= 35) {
						System.out.println("  " + "[ 과체중 입니다 ]" + "  ");
					} else if (result3 >= 36 && result3 <= 40) {
						System.out.println("  " + "[ 비만 입니다 ]" + "  ");
					} else
						System.out.println("[ 고도비만 입니다 ]");
				}

				System.out.println();

			case 6:
				System.out.println("계속하시려면 yes, 종료하시려면 no를 입력하세요.");

				con = scanner.next(); // String yesNo = scanner.next();

				if (con.equals("yes")) {
					System.out.println("다시 시작합니다"); // if(yesNo.equals("no")) run =! run;
					break;

				}

				if (con.equals("no")) {
					System.out.println("프로그램을 종료합니다.");
					run = false;

				}

			}

		}
	}

}
