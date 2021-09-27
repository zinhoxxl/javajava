package ch5_DoWhile;

public class DoWhile4 {

	public static void main(String[] args) {

		int i = 1, j = 2;
		// 중첩 do~while문으로 구구단 출력
		do {
			do {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
				j++;
			} while (j <= 9);
			i++;
			j = 2;
			System.out.println();
		} while (i <= 9);
  
	}

}
