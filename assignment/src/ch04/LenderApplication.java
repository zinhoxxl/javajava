package ch04;

import java.util.Scanner;

public class LenderApplication {

	private static SeperateVolume[] svArr = new SeperateVolume[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;// idx=0;

	public static void main(String[] args) { // ���ν���

		boolean run = true;
		while (run) {
			System.out.println("StockApplication�� �����մϴ�");
			System.out.println("===========================================");
			System.out.println("1.������� | 2.������� | 3.�뿩 | 4.�ݳ� | 5.����");
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
			} // switch ��
		} // while ��
		System.out.println("���α׷� ����");
	} // ���� ��

// ���� ����ϱ�
	public static void createLender() {

	}

// ���� ���
	public static void lenderList() {

	}

// ���� �뿩
	public static void lenderRental() {

	}

// ���� �ݳ�
	public static void lenderReturn() {

	}

} // Ŭ���� ����
