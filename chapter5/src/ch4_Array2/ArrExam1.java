package ch4_Array2;

import java.util.Scanner;

public class ArrExam1 {

	public static void main(String[] args) {

		// ����Բ��� �Ͻ� �� �������� ���� �迭 ��������
		// ����ǥ ���α׷�
		// ��ĳ�ʷ� ���� �Է� �ޱ� int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 }; int[] scores
		// =new int[8];
		// �Է��� ������ �հ�, ��� ����ϱ�
		// for���� ���� for������ ����ϱ�
		// 1.�����Է� | 2.���(��/���) ��� | 3. ������ ����ϱ� | 4. ����
		// ch4 7�� Ȯ�ι��� ����.

		Scanner scanner = new Scanner(System.in); //

		int[] scores = new int[8];
		boolean run = true;
		int sum = 0;
		double avg = 0;

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.�����Է�|2.���(��/���)���|3.������ ����ϱ�|4. ����");
			System.out.println("---------------------------------------");

			int menu = scanner.nextInt();

			if (menu == 1) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("�����Է�[" + i + "]");
					scores[i] = scanner.nextInt();
				}

			} else if (menu == 2) {
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				System.out.print("�հ�:" + sum + "\t");
				System.out.println("���:" + sum / (double) scores.length);

			} else if (menu == 3) {
				int temp = 0;
				for (int i = 0; i < scores.length; i++) {
					for (int j = i + 1; j < scores.length; j++) {
						if (scores[i] < scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
						}
					}
				}
				System.out.println("������:");
				for (int i : scores) {
					System.out.print(i + "  ");
				}
				System.out.println();
			} else if (menu == 4) {
				run = false;
			}

		}
		System.out.println("����");
	}
}
