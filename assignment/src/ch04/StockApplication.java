package ch04;

import java.util.Scanner;

public class StockApplication {
	// 저장소 생성
	private static Stock[] stockArray = new Stock[100];
	private static Scanner scanner = new Scanner(System.in); 
	private static int idx;

	public static void main(String[] args) { // 메인시작

		boolean run = true;
		while (run) {
			System.out.println("StockApplication을 실행합니다");
			System.out.println("============================================================");
			System.out.println("1.Stock 생성하기 | 2.Stock 목록 | 3.입고 하기 | 4.출고 하기 | 5.종료");
			System.out.println("============================================================");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1: 
				createStock();
				break;

			case 2: 
				stockList();
				break;

			case 3:
				stockReceiving();
				break;

			case 4:
				stockRelease();
				break;

			case 5:
				run = false;
				break;
			} // switch 끝
		} // while 끝
		System.out.println("프로그램 종료");
	} // 메인 끝

	// stock 생성하기
	private static void createStock() {
		System.out.println("----------");
		System.out.println("Stock 생성");
		System.out.println("----------");

		System.out.print("제품 이름: ");
		String name = scanner.next();
		
		System.out.print("등록과동시에 등록하실 Stock 재고량(숫자로표기): ");
		int qty = scanner.nextInt();

		Stock acc = new Stock(name, qty);
		stockArray[idx++] = acc;
	
		System.out.println("[[ Stock 생성완료!! 환영합니다. ]]");
	}
		


	// stock 목록
	private static void stockList() {
		System.out.println("--------------");
		System.out.println("Stock 목록입니다");
		System.out.println("--------------"); 

		for (int i = 0; i < stockArray.length; i++) {
			Stock stock = stockArray[i];
			if (stock != null) {
				System.out.println(stockArray[i]);
			}
		} 
	}
				


	// 입고 하기
	private static void stockReceiving() {

		System.out.println("--------------------------------------");
		System.out.println("입고하실 제품명과, 제품양을 입력해주세요!");
		System.out.println("--------------------------------------");

		System.out.print("제품명: ");
		String item = scanner.next();

		System.out.print("Stock 재고: "); 
		int amount = scanner.nextInt(); 

		Stock acc = findStock(item);

		if (acc != null) {
			acc.setQty(acc.getQty() + amount);
			System.out.println("[ Stock 입고가 완료되었습니다!! ]");
		} else {
			System.out.println("찾으시는 Stock은 존재하지 않습니다..");
		}
	}



	// 출고 하기
	private static void stockRelease() {

		System.out.println("--------------------------------------");
		System.out.println("출고하실 제품명, 제품양을 입력해주세요!");
		System.out.println("--------------------------------------");

		System.out.print("제품명: ");
		String item = scanner.next();

		System.out.print("Stock 재고: ");
		int amount = scanner.nextInt();

		Stock acc = findStock(item);
		if (acc != null) {
			if (acc.getQty() - amount >= 0) {
				acc.setQty(acc.getQty() - amount);
				System.out.println("[ Stock 출고가 완료되었습니다!! ]");
			} else {
				System.out.println("보관중인 제품양보다 많이 출고하실수는 없습니다..");
			}

		} else { 
			System.out.println("찾으시는 Stock은 존재하지 않습니다..");
		}
	}
 
	
	// 입출고시 동일한 Stock객체 찾기
	private static Stock findStock(String name) {
		Stock stock = null;
		for (int i = 0; i < stockArray.length; i++) {
			stock = stockArray[i]; 
			if (stock != null) {
				if (stock.getName().equals(name))
					break;
			}
		}
		return stock;
	}

} // 클래스 종료
