package ch1_Reference;

public class ReferencesExam1 {

	public static void main(String[] args) {
		// ���ͷ��� ���ڿ� ����
		String strA = "����ȣ";
		String strB = "����ȣ";  
		if (strA == strB)
			System.out.println("���� ���ڿ��� �����Ѵ�.");
		else
			System.out.println("�ٸ� ���ڿ��� �����Ѵ�.");

		// new String() - �����ڷ� ���ڿ� ����
		String str1 = new String("����ȣ"); 
		String str2 = new String("����ȣ"); 
		if (str1 == str2)
			System.out.println("���� ���ڿ��� �����Ѵ�.");
		else
			System.out.println("�ٸ� ���ڿ��� �����Ѵ�.");

	}

}
