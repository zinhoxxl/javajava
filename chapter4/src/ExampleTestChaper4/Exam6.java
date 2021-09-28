package ExampleTestChaper4;

public class Exam6 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // 가로 출력문
				if (j == i) {
					System.out.println(); // 세로 출력문
				}
			}
		}

	}

}
