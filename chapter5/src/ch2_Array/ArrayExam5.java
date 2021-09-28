package ch2_Array;

public class ArrayExam5 {

	public static void main(String[] args) {

		// 배열선언
		// 타입 변수명[] = {초기값1, 초기값2,....}
		int scores[] = null;
		// 배열에 저장할 갯수와 초기값을 알고 있을 때는 초기값으로 배열을 바로 초기화 하면서 생성가능.
		scores = new int[] {10,15,5,7,8,3,9,10,5,4};
		
		System.out.println(scores.length);

		 

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i]; // 배열에 저장된 요소 접근 - 배열 변수명[index번호]
		}

		double avg = sum / (double) scores.length;
		System.out.println("avg:" + avg);

	}

}
