package ch03;

public class A {

	// 필드를 선언하고 자식(구현체)으로 초기화
	Parent p = new Child(); // 자식타입이 부모타입으로 promotion
	
	void method() {
		// 구현체에서 추가된 멤버는
		// 부모타입으로 변환후 접근불가
		// p.childF = 3;
		// p.childM();
		
		// 자식클래스에서 재정의 된 메소드는 
		// 부모타입으로 변환후 접근가능 - 재정의된 내용실행
		p.parentMethod();
	}

	// 무명인터페이스 선언
	// 구현체(상속) 만들어서 Parent타입으로 promotion한 상태
	Parent p2 = new Parent() {

		// 구현클래스에서 추가된 멤버
		int childF; // 필드
		void childM() {} // 메소드
		
		@Override
		public void parentMethod() {
			childF= 3;
			childM();
			
		}
		
	};
	
	void mehtod2() {
		// 구현체에서 추가된 멤버는
		// 부모타입으로 변환후 접근불가
		// p.childF = 3;
		// p.childM();
		
		// 자식클래스에서 재정의 된 메소드는 
		// 부모타입으로 변환후 접근가능 - 재정의된 내용실행
		p2.parentMethod();
	}
}
	
	
	
	
	
	
