package ch01_02;

public class Ex0201 {
	public static void main(String[] args) {

		//����ü����ó��
		MyInter2 mi = new MyInter2() {
			
			@Override
			public void me2(int x, int y) {
				System.out.println(x+"+"+y+"="+(x+y));
			}
		};
		mi.me2(10, 20);
		
		//���ٽ�
		mi = (x,y) -> System.out.println(x+"+"+y+"="+(x+y));
		mi.me2(10, 20);
		
		
		
		
	}

}
