package ExampleTestChaper4;

public class Exam3 {

	public static void main(String[] args) {
		// 누적합을 위한 정수 타입 변수 선언하고 0으로 초기화
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // 배수공식 :i%2==0, i%5==o
				sum += i; // sum=sum+i;
			}
		}
		System.out.println("3의 배수의 합:" + sum); // 1683
	}

}
