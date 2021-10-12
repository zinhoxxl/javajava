package ch05;

public class InterMain {

	public static void main(String[] args) {

		InterfaceA ia = new CA();
		ia.methodA();
		// interfaceA에 없는 메소드
		// ia.methodC();
		
		
		
		InterfaceB ib = new CA();
		ia.methodB();
		ia.methodC();
		
		
		
	}

}
