package ch3_Array;

public class Ex06 {

	public static void main(String[] args) {

		// 1차원 배열의 최대값 최소값 구하기
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };
		// max 변수에 배열의 값들 보다 현저하게 작은값 저장하여 선언
		// min 변수에 배열의 값들 보다 현저하게 큰 값 저장하여 선언
		int sum = 0, max = 0, min = 100;

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 평균
			if (max < score[i]) max = score[i]; // max값 보다 score 값이 크면 교환 (최대값)
			if (min > score[i]) min = score[i]; // min값 보다 score 값이 작으면 교환 (최소값)

		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		System.out.println("평균:"+sum/(double)score.length); 
	}

}
