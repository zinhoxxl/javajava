package ch02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamEx {
	public static void main(String[] args) {
		byte b[] = { 7, 51, 3, 4, -1, 24 };
		// 1byte�� �̵��ϴ� ��Ʈ�� ����
		try {
			FileOutputStream fout = new FileOutputStream("c:\\temp\\test.out");
			for (int i = 0; i < b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch (Exception e) {
			System.out.println("��� �� ���� Ȯ��!!!");
		}
		System.out.println("c:\\temp\\test.out�� �����Ͽ����ϴ�");

	} 

}
