package ch8___Reference;

public class ReferenceNullExam {

	public static void main(String[] args) {

		String str1 = new String("����ȣ");
		System.out.println(str1);
		// ���
		str1 = null;
		System.out.println(str1); // null

	}

}
