package ch5_DoWhile;

public class DoWhileSample {

	public static void main(String[] args) {

		char c = 'a';

		do {
			System.out.print(c);
	    	   System.out.print(c+1);
	    	   c = (char)(c+1);
		} while (c <= 'z');

	}

}
