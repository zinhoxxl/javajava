package ch07_final;

public class Person {

	// final필드는 선언과 동시에 초기화
	final String nation = "Korea";
	// 생성자에서 final필드를 초기화 할수 있는 경우 선언만 해놔도 오류발생하지 않음.
	final String ssn;
	String name;

	// 생성자에 final 필드를 초기화 하는 명령문 포함.
	public Person(String ssn, String name) {

		this.ssn = ssn;
		this.name = name;
	}

// 지금처럼 메인메소드가 같은 클래스안에 들어가서 사용도 가능하다 !!
	public static void main(String[] args) {
		Person person = new Person("20010101-1234567", "홍길동");
//		person.nation = "usa";
//		person.ssn="1234";          즉 만들어진 이후에는 수정못하게 하는게 final 사용 이유!
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);

	}

}
