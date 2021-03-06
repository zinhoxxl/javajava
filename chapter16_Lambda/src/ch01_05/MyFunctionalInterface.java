package ch01_05;

@FunctionalInterface
public interface MyFunctionalInterface {
	public void method();
}

class UsingThis {
	public int outterField = 10;

	class Inner {
		int innerField = 20;

		void method() { //인터페이스타입 변수 = 실체(자식)객체(instance)의 생성후 프로모션
			MyFunctionalInterface fi 
			= new MyFunctionalInterface() {
				//int innerField=20; //@이거랑
				@Override
				public void method() {
					System.out.println("outterField:"+outterField);
					System.out.println("outterField:"+UsingThis.this.outterField);
					
					System.out.println("innerField:"+innerField);
					//System.out.println("innerField:"+this.innerField); //접근불가 @이거
				}
			};
			fi.method();
		}
	}
}