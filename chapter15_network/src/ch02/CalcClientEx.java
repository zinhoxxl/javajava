package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClientEx {
	public static void main(String[] args) {

		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			// ������ ����
		//	socket = new Socket("192.168.0.199",9999); //cmd���� �˾Ƴ� ���ּ�
		//	socket = new Socket("127.0.0.1",9999); //��pc���� �����ϴ¹� (��� �� ����)
			socket = new Socket("localhost",9999); //��pc���� �����ϴ¹� (��� �� ����)

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if (socket != null)
					socket.close();
			} catch (Exception e) {
				System.out.println("������ ��� �� ���� �߻�");
			}
		}

	}

}
