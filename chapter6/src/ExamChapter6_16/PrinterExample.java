package ExamChapter6_16;

public class PrinterExample { // 16번 확인문제 (2)

	public static void main(String[] args) {

		Printer printer = new Printer(); // 객체 생성 (static아니라서)
		printer.println(10);
		printer.println(true);
		printer.println(5.7); 
		printer.println("홍길동");

	}

} 
// 메소드 오버로딩 문제
class Printer { // 16번 확인문제 (1)

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
