package ch3_Array2;

public class Ex4 {

	public static void main(String[] args) {

		int[] score = { 78, 98, 54, 76, 87 };
		System.out.println("�迭�� ����:" + score.length);
		// ����
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}

		System.out.println("����:" + total);
		// ���-doubleŸ�� �������
		double avg = 0; // 0 -> 0.0 �ڵ� ����ȯ
		avg = total / (double) score.length;
		System.out.println("���:" + avg);

	}

}
