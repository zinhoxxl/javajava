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

		System.out.println("1������ ������� �Է��ϼ���!");

		while (run) {

			System.out.println("----------------------------------");
			System.out.println("1.���� |2.���� |3.Ű |4.������ |5.���");
			System.out.println("----------------------------------");
			System.out.println("����> ");

			int selectNo = scanner.nextInt();
			if (selectNo > 5) {
				System.out.println("������ �ȿ��� ��ȣ�� ����ּ���");
			}

			switch (selectNo) {
			case 1:
				System.out.println("������ �Է��ϼ���.(���� �Ǵ� ����)");
				System.out.print("�Է�>");
				gender = scanner.next();
				break;

			case 2:
				System.out.println("���̸� �Է��ϼ���.");
				System.out.print("�Է�>");
				age = scanner.nextInt();
				break;

			case 3:
				System.out.println("Ű�� �Է��ϼ���.");
				System.out.print("�Է�>");
				height = scanner.nextInt();
				break;

			case 4:
				System.out.println("�����Ը� �Է��ϼ���.");
				System.out.print("�Է�>");
				weight = scanner.nextInt();
				break;

			case 5:
				final double ST1 = 1.10;
				final double ST2 = 128;

				// �����淮
				double result = ST1 * weight - ST2 * ((weight * weight) / (double) (height * height));
				System.out.println("�����淮: [" + Math.round(result) + "kg] �Դϴ�");

				// ü���淮
				double result2 = weight - result;

				System.out.println("ü���淮: [" + Math.round(result2) + "kg] �Դϴ�");

				// ü����� ���ϱ� = ü���淮*100/ü��
				final double ST3 = 100;

				double result3 = result2 * ST3 / weight;

				System.out.println("ü�����: [" + Math.round(result3) + "%] �Դϴ�.");
				System.out.println();

				System.out.println("����Ͻ÷��� yes, �����Ͻ÷��� no�� �Է��ϼ���.");
				con = scanner.next();

				if (con == "yes") {
					System.out.println("�ٽ� �����մϴ�.");
					continue;
				}
				if (con == "no") {

					break;

				}
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
			}
			

		} 
	}

}
