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

		System.out.println("ü���淮���ϱ�~ ������� �ۼ����ּ���");
		System.out.println();
		System.out.println("--------------------------"); // ������� println ������ �ٷ� ���� scanner�� ������
		System.out.println("1.���� |2.���� |3.Ű |4.������");
		System.out.println("--------------------------");
		System.out.println();

		Scanner scanner = new Scanner(System.in);

		while (run) {
			gender = scanner.next();
			System.out.println("�����Ͻ÷��� 1�� �Է��ϼ���");
			selectNo = 0;
			selectNo = scanner.nextInt();
			if (selectNo != 1) {
				continue;
			}

			switch (selectNo) {
			case 1:
				System.out.println();
				System.out.println("�����մϴ�");
				System.out.println("������ �Է��ϼ���.(���� �Ǵ� ����)");
				System.out.print("�Է�>");

				gender = scanner.next();
				System.out.println();

			case 2:
				System.out.println("���̸� �Է��ϼ���.");
				System.out.print("�Է�>");

				age = scanner.nextInt();
				System.out.println();

			case 3:
				System.out.println("Ű�� �Է��ϼ���.");
				System.out.print("�Է�>");

				height = scanner.nextInt();
				System.out.println();

			case 4:
				System.out.println("�����Ը� �Է��ϼ���.");
				System.out.print("�Է�>");

				weight = scanner.nextInt();
				System.out.println();

			case 5:
				final double ST1 = 1.10, ST11 = 1.07;
				final double ST2 = 128;

				System.out.println("���>");
				System.out.println();

				// ����
				if (gender.equals("����")) {
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

					if (result3 < 12) {
						System.out.println("  " + "[ ����ü�� �Դϴ� ]" + "  ");
					} else if (result3 >= 12 && result3 <= 17) {
						System.out.println("  " + "[ ǥ��ü�� �Դϴ� ]" + "  ");
					} else if (result3 >= 18 && result3 <= 22) {
						System.out.println("  " + "[ ��ü�� �Դϴ� ]" + "  ");
					} else if (result3 >= 23 && result3 <= 27) {
						System.out.println("  " + "[ �� �Դϴ� ]" + "  ");
					} else
						System.out.println("[ ���� �Դϴ� ]");
				}

				// ����
				if (gender.equals("����")) {
					// �����淮
					double result = ST11 * weight - ST2 * ((weight * weight) / (double) (height * height));
					System.out.println("�����淮: [" + Math.round(result) + "kg] �Դϴ�");

					// ü���淮
					double result2 = weight - result;

					System.out.println("ü���淮: [" + Math.round(result2) + "kg] �Դϴ�");

					// ü����� ���ϱ� = ü���淮*100/ü��
					final double ST3 = 100;

					double result3 = result2 * ST3 / weight;

					System.out.println("ü�����: [" + Math.round(result3) + "%] �Դϴ�.");
					System.out.println();

					if (result3 < 22) {
						System.out.println("  " + "[ ����ü�� �Դϴ� ]" + "  ");
					} else if (result3 >= 22 && result3 <= 27) {
						System.out.println("  " + "[ ǥ��ü�� �Դϴ� ]" + "  "); // bodyFatRatio <=27
					} else if (result3 >= 28 && result3 <= 35) {
						System.out.println("  " + "[ ��ü�� �Դϴ� ]" + "  ");
					} else if (result3 >= 36 && result3 <= 40) {
						System.out.println("  " + "[ �� �Դϴ� ]" + "  ");
					} else
						System.out.println("[ ���� �Դϴ� ]");
				}

				System.out.println();

			case 6:
				System.out.println("����Ͻ÷��� yes, �����Ͻ÷��� no�� �Է��ϼ���.");

				con = scanner.next(); // String yesNo = scanner.next();

				if (con.equals("yes")) {
					System.out.println("�ٽ� �����մϴ�"); // if(yesNo.equals("no")) run =! run;
					break;

				}

				if (con.equals("no")) {
					System.out.println("���α׷��� �����մϴ�.");
					run = false;

				}

			}

		}
	}

}
