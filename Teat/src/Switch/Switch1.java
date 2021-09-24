package Switch;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch(num) {
		case 1: System.out.println("L"); break;
		case 2: System.out.println("O"); break;
		case 3: System.out.println("V"); break;
		case 4: System.out.println("E"); break;
		default: System.out.println("¹¹¾ß");
		}
	}

}
