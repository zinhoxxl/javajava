package ch3_Array;

public class Ex05 {

	public static void main(String[] args) {

		double[] scores = { 72.5, 32.4, 48.5, 99.8, 55.4 };

		// ���� for���� �̿��Ͽ�
		// �հ� ��� ���
		double total = 0;
		for (int i = 0; i < scores.length; i++)
			total += scores[i];
		total = 0;

		for (double k : scores) {
			total += k;
		}
		// System.out.println("�հ�:"+total);
		System.out.printf("�հ�:%.2f\n", total);
		//System.out.println((int) (total * 100) / 100.0);
		System.out.println("�հ�:" + ((int) (total * 100) / 100));

		double avg;
		// �Ҽ��� �ڸ��� printf("%.ǥ���ҼҼ��� �ڸ���f",��);
		System.out.printf("%.3f", 72.121612);

	}

}
