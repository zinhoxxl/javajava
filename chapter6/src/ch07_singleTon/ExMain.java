package ch07_singleTon;

public class ExMain {

	public static void main(String[] args) {

		// multiton방식 - new 생성자();
		// SingleTon s1 = new SingleTon();
		// SingleTon s1 = SingleTon.instance;
		// 클래스명.static메소드호출()
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		
		System.out.println(s1==s2?"같은 객체":"다른객체");
		
		 
	}

}
