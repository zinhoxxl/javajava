package ch3_Array;

public class Ex07 {

	public static void main(String[] args) {

		// 1차원 배열의 최대값 최소값 구하기
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };
		// max 변수에 배열의 값들 보다 현저하게 작은값 저장하여 선언
		// min 변수에 배열의 값들 보다 현저하게 큰 값 저장하여 선언
		int sum = 0, max = 0, min = 100;
		// 향상된 for문으로 수정해서 최대값, 최소값, 합계, 평균을 출력하시오

		for (int k : score) {
			sum += k; // 평균
			if (max < k) max = k; // max값 보다 score 값이 크면 교환 (최대값)
		}
		System.out.println("최대값:" + max);
		
		for (int j : score) {
			if (min > j) min = j; 
		}
		System.out.println("최소값:" + min);
		
		System.out.println("합계:" + sum);
		System.out.println("평균:" + sum / (double) score.length);
	}

}
