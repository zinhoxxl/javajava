package ExampleTestChaper4;

public class Exam4 {

	public static void main(String[] args) {

		while (true) { // 무한반복
			int num1 = (int) (Math.random() * 6) + 1; // 1번 주사위
			int num2 = (int) (Math.random() * 6) + 1;// 2번 주사위
			System.out.println("(" + num1 + "," + num2 + ")");
			if ((num1 + num2) == 5) {// 무한반복을 빠져나가는 조건
				break;
			}
		}

	}

}
