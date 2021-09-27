package ch5_DoWhile;

import java.util.Scanner;

public class DoWhile5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		int ran = (int) (Math.random() * 100) + 1; // 정수 임의값 저장! 즉 정답
		int cnt = 1; // 몇번만에 맞춘지 알려줄것

		do {
			System.out.println("1부터 100까지의 숫자 입력!");
			int num = scanner.nextInt();
			if (num == ran) {
				System.out.println("축하!" + cnt + "번 만에 맞췄습니다.");
				break; //반복문 블럭을 벗어나는 명령문

			} else if (num > ran) {
				System.out.println("입력된숫자가 랜덤숫자보다 큽니다.");
			} else {
				System.out.println("입력된숫자가 랜덤숫자보다 작습니다.");
			}
			cnt++;
		} while (true); // 무한 반복

	}

}
