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
			// 서버와 연결
		//	socket = new Socket("192.168.0.199",9999); //cmd에서 알아낸 내주소
		//	socket = new Socket("127.0.0.1",9999); //내pc에서 연결하는법 (모든 컴 동일)
			socket = new Socket("localhost",9999); //내pc에서 연결하는법 (모든 컴 동일)

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if (socket != null)
					socket.close();
			} catch (Exception e) {
				System.out.println("서버와 통신 중 오류 발생");
			}
		}

	}

}
