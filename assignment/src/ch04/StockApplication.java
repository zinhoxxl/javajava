package ch04;

import java.util.Scanner;

public class StockApplication {
	// ����� ����
	private static Stock[] stockArray = new Stock[100];
	private static Scanner scanner = new Scanner(System.in); 
	private static int idx;

	public static void main(String[] args) { // ���ν���

		boolean run = true;
		while (run) {
			System.out.println("StockApplication�� �����մϴ�");
			System.out.println("============================================================");
			System.out.println("1.Stock �����ϱ� | 2.Stock ��� | 3.�԰� �ϱ� | 4.��� �ϱ� | 5.����");
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
			} // switch ��
		} // while ��
		System.out.println("���α׷� ����");
	} // ���� ��

	// stock �����ϱ�
	private static void createStock() {
		System.out.println("----------");
		System.out.println("Stock ����");
		System.out.println("----------");

		System.out.print("��ǰ �̸�: ");
		String name = scanner.next();
		
		System.out.print("��ϰ����ÿ� ����Ͻ� Stock ���(���ڷ�ǥ��): ");
		int qty = scanner.nextInt();

		Stock acc = new Stock(name, qty);
		stockArray[idx++] = acc;
	
		System.out.println("[[ Stock �����Ϸ�!! ȯ���մϴ�. ]]");
	}
		


	// stock ���
	private static void stockList() {
		System.out.println("--------------");
		System.out.println("Stock ����Դϴ�");
		System.out.println("--------------"); 

		for (int i = 0; i < stockArray.length; i++) {
			Stock stock = stockArray[i];
			if (stock != null) {
				System.out.println(stockArray[i]);
			}
		} 
	}
				


	// �԰� �ϱ�
	private static void stockReceiving() {

		System.out.println("--------------------------------------");
		System.out.println("�԰��Ͻ� ��ǰ���, ��ǰ���� �Է����ּ���!");
		System.out.println("--------------------------------------");

		System.out.print("��ǰ��: ");
		String item = scanner.next();

		System.out.print("Stock ���: "); 
		int amount = scanner.nextInt(); 

		Stock acc = findStock(item);

		if (acc != null) {
			acc.setQty(acc.getQty() + amount);
			System.out.println("[ Stock �԰� �Ϸ�Ǿ����ϴ�!! ]");
		} else {
			System.out.println("ã���ô� Stock�� �������� �ʽ��ϴ�..");
		}
	}



	// ��� �ϱ�
	private static void stockRelease() {

		System.out.println("--------------------------------------");
		System.out.println("����Ͻ� ��ǰ��, ��ǰ���� �Է����ּ���!");
		System.out.println("--------------------------------------");

		System.out.print("��ǰ��: ");
		String item = scanner.next();

		System.out.print("Stock ���: ");
		int amount = scanner.nextInt();

		Stock acc = findStock(item);
		if (acc != null) {
			if (acc.getQty() - amount >= 0) {
				acc.setQty(acc.getQty() - amount);
				System.out.println("[ Stock ��� �Ϸ�Ǿ����ϴ�!! ]");
			} else {
				System.out.println("�������� ��ǰ�纸�� ���� ����ϽǼ��� �����ϴ�..");
			}

		} else { 
			System.out.println("ã���ô� Stock�� �������� �ʽ��ϴ�..");
		}
	}
 
	
	// ������ ������ Stock��ü ã��
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

} // Ŭ���� ����
