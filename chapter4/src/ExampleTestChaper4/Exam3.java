package ExampleTestChaper4;

public class Exam3 {

	public static void main(String[] args) {
		// �������� ���� ���� Ÿ�� ���� �����ϰ� 0���� �ʱ�ȭ
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // ������� :i%2==0, i%5==o
				sum += i; // sum=sum+i;
			}
		}
		System.out.println("3�� ����� ��:" + sum); // 1683
	}

}
