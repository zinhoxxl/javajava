package ch04;

import java.util.Scanner;

public class LenderApplication {

	private static SeperateVolume[] svArr = new SeperateVolume[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;// idx=0;

	public static void main(String[] args) { // 메인시작

		boolean run = true;
		while (run) {
			System.out.println("StockApplication을 실행합니다");
			System.out.println("===========================================");
			System.out.println("1.도서등록 | 2.도서목록 | 3.대여 | 4.반납 | 5.종료");
			System.out.println("===========================================");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				createLender();
				break;

			case 2:
				lenderList();
				break;

			case 3:
				lenderRental();
				break;

			case 4:
				lenderReturn();
				break;

			case 5:
				run = false;
				break;
			} // switch 끝
		} // while 끝
		System.out.println("프로그램 종료");
	} // 메인 끝

// 도서 등록하기
	public static void createLender() {

	}

// 도서 목록
	public static void lenderList() {

	}

// 도서 대여
	public static void lenderRental() {

	}

// 도서 반납
	public static void lenderReturn() {

	}

} // 클래스 종료
