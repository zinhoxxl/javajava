package While;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyControlExample3 {

	public static void main(String[] args) throws IOException {

		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		Scanner scanner = new Scanner(System.in);
		// ��ĳ�ʴ� enterŰ ���� ���� ���� ���� ����.

		while (run) {
			if (keyCode != -1) {
				System.out.println("----------------------");
				System.out.println("1.���� | 2.���� | 3.����:");
				System.out.println("----------------------");
				System.out.println("����:");
			}
			// '0'�� int���� 48 49-48=1, 50-48=2 51-48=3
			keyCode = scanner.nextInt(); // Ű���� �κ��� IntŸ�� �� �Է�
			System.in.read(); // \r =13
			System.in.read(); // \r =10

			if (keyCode == 1) { // "1"
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 2) { // "2"
				speed--;
				System.out.println("���� �ӵ�=" + speed);

			} else if (keyCode == 3) { // "3"
				run = false;
			}

		} // while��.
		System.out.println("����");

	}

}
