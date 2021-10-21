package ch01_02;

public class Ex0201 {
	public static void main(String[] args) {

		//公疙按眉积己贸府
		MyInter2 mi = new MyInter2() {
			
			@Override
			public void me2(int x, int y) {
				System.out.println(x+"+"+y+"="+(x+y));
			}
		};
		mi.me2(10, 20);
		
		//恩促侥
		mi = (x,y) -> System.out.println(x+"+"+y+"="+(x+y));
		mi.me2(10, 20);
		
		
		
		
	}

}
