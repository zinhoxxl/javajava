package ch03;

public class Person {

	// �ʵ�
	// (���� �Ӽ�)
	String name;
	int year;
	int age;
	
	// ������
	Person(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	// �޼ҵ�
	void personInfo() {
		age = 2021 - year;
		System.out.println(name+","+age+" ");
	}
	
}
