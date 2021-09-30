package ch01;

// main() 메소드가 없는 클래스 라이브러리용
public class Person {
	// 속성
	// 기능
	void calc() {
		// Calculator의 add()메소드에 10 과 20을 전달하여 신호 전송
		int result = Calculator.add(10, 20);
		// 전달된 결과 값을 출력
		System.out.println(result);
	}

}
