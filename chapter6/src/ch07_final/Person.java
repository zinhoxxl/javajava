package ch07_final;

public class Person {

	// final�ʵ�� ����� ���ÿ� �ʱ�ȭ
	final String nation = "Korea";
	// �����ڿ��� final�ʵ带 �ʱ�ȭ �Ҽ� �ִ� ��� ���� �س��� �����߻����� ����.
	final String ssn;
	String name;

	// �����ڿ� final �ʵ带 �ʱ�ȭ �ϴ� ��ɹ� ����.
	public Person(String ssn, String name) {

		this.ssn = ssn;
		this.name = name;
	}

// ����ó�� ���θ޼ҵ尡 ���� Ŭ�����ȿ� ���� ��뵵 �����ϴ� !!
	public static void main(String[] args) {
		Person person = new Person("20010101-1234567", "ȫ�浿");
//		person.nation = "usa";
//		person.ssn="1234";          �� ������� ���Ŀ��� �������ϰ� �ϴ°� final ��� ����!
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);

	}

}
