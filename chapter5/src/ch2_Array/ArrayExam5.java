package ch2_Array;

public class ArrayExam5 {

	public static void main(String[] args) {

		// �迭����
		// Ÿ�� ������[] = {�ʱⰪ1, �ʱⰪ2,....}
		int scores[] = null;
		// �迭�� ������ ������ �ʱⰪ�� �˰� ���� ���� �ʱⰪ���� �迭�� �ٷ� �ʱ�ȭ �ϸ鼭 ��������.
		scores = new int[] {10,15,5,7,8,3,9,10,5,4};
		
		System.out.println(scores.length);

		 

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i]; // �迭�� ����� ��� ���� - �迭 ������[index��ȣ]
		}

		double avg = sum / (double) scores.length;
		System.out.println("avg:" + avg);

	}

}
