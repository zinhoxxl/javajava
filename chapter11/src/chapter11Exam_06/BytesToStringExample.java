package chapter11Exam_06;

public class BytesToStringExample {
	public static void main(String[] args) {

		// 네트워크를 통한 채팅시
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };

		String str = new String(bytes);
		
	    System.out.println(str);
		
		
	}

}
