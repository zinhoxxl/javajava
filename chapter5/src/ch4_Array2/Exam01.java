package ch4_Array2;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// ����!!
		// 1. id= "hong" , pwd = "1234"
		// id�� pwd�� scanner�� �Է¹޾Ƽ� id�� pwd�� �Ѵ� ������ "login����",
		// �ƴϸ� "1ȸ �����Ͽ����ϴ�." ���
		// 5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�" ��� �� ����

		Scanner scanner = new Scanner(System.in);

		String id;
		String pwd;
		int cnt = 0;
		boolean run = true;

		while (run) {
			System.out.println("���̵�� �н����带 �Է��ϼ���.");
			System.out.println("���̵�> ");
			id = scanner.next();
			System.out.println("�н�����> ");
			pwd = scanner.next();

			cnt++;

			if (id.equals("hong") && pwd.equals("1234")) {
				System.out.println("login ����");
				break;
			} else {

				if (cnt == 5) {
					System.out.println(cnt + "ȸ �����Ͽ����ϴ�. ���α׷��� �����մϴ�.");
					run = !run;

				} else {
					System.out.println(cnt + "ȸ �����Ͽ����ϴ�.");
				}

			}

		}

	}
}
