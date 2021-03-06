package ch3_Array;

public class Ex08Sort {

	/* 배열 요소들의 타입이 기본 타입 */
	public static void main(String[] args) {

		// 1차원 배열의 오름차순 정렬
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 }; // 34,45,50,76,89,90,92,100 (오름차순 정렬)
		int temp = 0; // 배열 요소의 값을 임시 저장할 변수
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) { // i의 값이 크면 j의 값과 교환
					temp = score[i]; // i 의 값을 임시 변수로 저장
					score[i] = score[j]; // j의 값을 i 에 저장 후
					score[j] = temp; // 임시 저장한 값을 다시j에 저장 
				} 
			}
		}
		// 정렬된 내용 출력
		for (int i : score) {
			System.out.print(i + "  ");
		}
	}
}
