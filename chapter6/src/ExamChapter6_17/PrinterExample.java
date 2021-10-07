package ExamChapter6_17;

public class PrinterExample { // 17번 확인문제 (2)

	public static void main(String[] args) {

		// 객체 생성안함
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");

	}

}

class Printer { // 17번 확인문제 (1)

	static void println(int a) {
		System.out.println(a);
	}

	static void println(boolean b) {
		System.out.println(b);
	}

	static void println(double c) {
		System.out.println(c);
	}

	static void println(String str) {
		System.out.println(str);
	}

}