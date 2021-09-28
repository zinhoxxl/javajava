package ch1_Reference;

public class ReferencesExam1 {

	public static void main(String[] args) {
		// 리터럴오 문자열 생성
		String strA = "이진호";
		String strB = "이진호";  
		if (strA == strB)
			System.out.println("같은 문자열을 참조한다.");
		else
			System.out.println("다른 문자열을 참조한다.");

		// new String() - 생성자로 문자열 생성
		String str1 = new String("이진호"); 
		String str2 = new String("이진호"); 
		if (str1 == str2)
			System.out.println("같은 문자열을 참조한다.");
		else
			System.out.println("다른 문자열을 참조한다.");

	}

}
