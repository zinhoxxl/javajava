package ch01_05;

@FunctionalInterface
public interface MyFunctionalInterface2 {
	public void method();
}

class UsingThis1{
	public int outterField=10;
	
	class Inner{
		int innerField = 20;
		
		void method() {//인터페이스타입 변수 = 실체(자식)객체(instance)의 생성후 프로모션 
			MyFunctionalInterface2 fi
		  = () -> {// 람다식은 하나의 변수에 식만 붙인겨, Inner입장에서는 완전 다른객체
			 System.out.println("outterField:"+outterField);
			 System.out.println("outterField:"+UsingThis1.this.outterField);
			 
			 System.out.println("innerField:"+innerField);
			 System.out.println("innerField:"+this.innerField);//접근불가
		  };
		fi.method();
		}
	}//Inner클래스 끝.
}