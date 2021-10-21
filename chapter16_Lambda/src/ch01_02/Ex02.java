package ch01_02;

public class Ex02 {
	public static void main(String[] args) {

		MyFunctionalInterface fi
		= new MyFunctionalInterface() {
			@Override
			public void method(int x) {
				System.out.println(x);
			}
		};
		fi.method(10);
		
		//람다식
		fi = x -> System.out.println(x); //타입도 알고있으니 제낀다
		fi.method(20);
		
		
	}

}
