package ch02_String;

public class String1Ex2 {
	public static void main(String[] args) {

		String subject = "�ڹ� ���α׷��� �ڹ� ���α׷���";
        // ���ڿ� ������ ó�� ������ index��ġ
		int index = subject.indexOf("���α׷���");
        // ���ڿ������� ���������� ������ index��ġ
        int index2 = subject.lastIndexOf("���α׷���");
		System.out.println(index);
		System.out.println(index2);
		
		String fileName = "fff.sss.aaa.jpg";
	    // ���ڿ����� ��������ġ
		int lastIndex = fileName.lastIndexOf(".");
		// ���ڿ� �ڸ��� substring(����, ��), substring(����);
		String ext = fileName.substring(lastIndex+1);  
		System.out.println(ext);
		
		
	}
}
