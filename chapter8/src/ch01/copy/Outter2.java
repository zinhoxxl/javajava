package ch01.copy;

// 자바 8이후 표현방식
public class Outter2 {
void method(int arg) {
	
	// arg =100;
	int localVariable; // 바뀌었지만 final이 아닌게 아님
	localVariable = 1;
	// localVariable = 10;
	
	// 로컬 클래스
	System.out.println(arg);
	// 메소드내의 로컬클래스에서 사용되는 변수는
	// 무조건 final 필드여야 한다!
	class Innter{
		public void method() {
			int result = arg + localVariable;
		}
	}
}
}
