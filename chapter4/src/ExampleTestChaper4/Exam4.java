package ExampleTestChaper4;

public class Exam4 {

	public static void main(String[] args) {

		while (true) { // ���ѹݺ�
			int num1 = (int) (Math.random() * 6) + 1; // 1�� �ֻ���
			int num2 = (int) (Math.random() * 6) + 1;// 2�� �ֻ���
			System.out.println("(" + num1 + "," + num2 + ")");
			if ((num1 + num2) == 5) {// ���ѹݺ��� ���������� ����
				break;
			}
		}

	}

}
