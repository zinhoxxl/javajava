package ch01;

public class MultiCatchEx {
	public static void main(String[] args) {

		String[] arr  = {"hello", "hi", "bye"};
		
		try {
			System.out.println(arr[3]); // 인덱스 오류
			int a =Integer.parseInt("십"); // 숫자형 오류
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외");
		}catch(NumberFormatException e) {
			System.out.println("숫자형 예외");
		}
	
	}

}
