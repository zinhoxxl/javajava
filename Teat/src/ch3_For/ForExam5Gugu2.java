package ch3_For;

public class ForExam5Gugu2 {
	// ���߹ݺ������� for��
	public static void main(String[] args) {

		int i;
		for (i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println(); // ���� ������ ������ ��ɹ�;
		}

		System.out.println("i=" + i);
	}

}
