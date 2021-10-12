package ch03;

public interface MyInterface {

	// 인터페이스 내에 실체가 있는 메소드
	// 구현시 모든메소드 재정의 안하고 쓸것만 재정의 할수있게 해줌
	default void method1() {}
	default void method2() {}
	default void method3() {}
	
	
}
