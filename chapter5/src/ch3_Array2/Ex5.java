package ch3_Array2;

public class Ex5 {

	public static void main(String[] args) {

		double[] scores = { 72.5, 32.4, 48.5, 99.8, 55.4 };

		// 향상된 for문을 이용하여
		// 합과 평균 출력
		double total = 0;
		for (int i = 0; i < scores.length; i++)
			total += scores[i];
		total = 0;

		for (double k : scores) {
			total += k;
		}
		// System.out.println("합계:"+total);
		System.out.printf("합계:%.2f\n", total);
		//System.out.println((int) (total * 100) / 100.0);
		System.out.println("합계:" + ((int) (total * 100) / 100));

		double avg;
		// 소수점 자리수 printf("%.표시할소수점 자리수f",값);
		System.out.printf("%.3f", 72.121612);

	}

}
