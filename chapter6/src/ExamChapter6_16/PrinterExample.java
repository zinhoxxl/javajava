package ExamChapter6_16;

public class PrinterExample { // 16�� Ȯ�ι��� (2)

	public static void main(String[] args) {

		Printer printer = new Printer(); // ��ü ���� (static�ƴ϶�)
		printer.println(10);
		printer.println(true);
		printer.println(5.7); 
		printer.println("ȫ�浿");

	}

} 
// �޼ҵ� �����ε� ����
class Printer { // 16�� Ȯ�ι��� (1)

	void println(int a) {
		System.out.println(a);
	}

	void println(boolean b) {
		System.out.println(b);
	}

	void println(double c) {
		System.out.println(c);
	}

	void println(String str) {
		System.out.println(str);
	}

}
