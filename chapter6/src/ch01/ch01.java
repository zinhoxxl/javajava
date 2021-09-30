package ch01;

// 프로그램 실행용 클래스 - main() 메소드로 부터 시작
public class ch01 {

	public static void main(String[] args) {

		Person person = new Person();
		// Person 객체에게 메소드를 호출 - 신호 전달
		// 참조변수.메소드명(); 으로 호출
		person.calc();
	}

}
