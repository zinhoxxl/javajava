package ch5_DoWhile;

public class DoWhileSample {

	public static void main(String[] args) {

		char c = 'a';

		do {
			System.out.println(c);
			c = (char) (c + 1);
			System.out.println(c);
		} while (c <= 'z');

	}

}
