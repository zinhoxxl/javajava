package ExamChapter6_17;

public class PrinterExample { // 17�� Ȯ�ι��� (2)

	public static void main(String[] args) {

		// ��ü ��������
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("ȫ�浿");

	}

}

class Printer { // 17�� Ȯ�ι��� (1)

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