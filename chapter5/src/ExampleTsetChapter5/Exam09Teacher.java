package ExampleTsetChapter5;

import java.util.Scanner;

public class Exam09Teacher {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];// 초기값을 모름, 저장될 공간의 길이 확보
				// System.out.println("저장할 학생 수:"+scores.length);
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
				System.out.println("입력완료");
				break;
			case 3:
				for (int i = 0; i < scores.length; i++)
					System.out.println("scores[" + i + "]>" + scores[i]);
				break;
			case 4:
				int max = 0, sum = 0;

				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max)
						max = scores[i];
					sum += scores[i];
				}
				System.out.println("최고점수:" + max);
				System.out.println("평균점수:" + sum / (double) scores.length);
				break;
			case 5:
				run = !run;
				break;
			}
		} // while문 끝.
		System.out.println("프로그램 종료");
	}

}
