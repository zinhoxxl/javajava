package ch3_Array2;

public class Ex4 {

	public static void main(String[] args) {

		int[] score = { 78, 98, 54, 76, 87 };
		System.out.println("¹è¿­ÀÇ °¹¼ö:" + score.length);
		// ÃÑÁ¡
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}

		System.out.println("ÃÑÁ¡:" + total);
		// Æò±Õ-doubleÅ¸ÀÔ ÇüÅÂÃâ·Â
		double avg = 0; // 0 -> 0.0 ÀÚµ¿ Çüº¯È¯
		avg = total / (double) score.length;
		System.out.println("Æò±Õ:" + avg);

	}

}
