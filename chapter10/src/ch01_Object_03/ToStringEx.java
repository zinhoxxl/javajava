package ch01_Object_03;

import java.sql.Date;

public class ToStringEx {
	public static void main(String[] args) {
		A a = new A();
		a.f1 = "field";
		a.i1 = 10;
		// toString메소드는 필드값 출력용으로 재정의 하여 사용. 
		System.out.println(a.toString());
		
		// Date클래스의 toString()은 날짜정보출력하도록 재정의 됨.
//		Date date = new Date();
//		System.out.println(date.toString());
//		
//		// System.out.print() 메소드의 매개변수로 참조변수가 전달
//		System.out.println(a);
//		System.out.println(date);

	}

}

class A extends Object {
	String f1;
	int i1;
	
	@Override
	public String toString() {
		return "A [f1=" + f1 + ", i1=" + i1 + "]";
	}
	
	
}
