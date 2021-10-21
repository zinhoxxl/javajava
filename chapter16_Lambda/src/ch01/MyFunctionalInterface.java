package ch01;

//함수적 인터페이스 - 추상메소드가 1개인 인터페이스
@FunctionalInterface //함수적인터체이스는 반드시 추상메소드가 1개만 있어야함
public interface MyFunctionalInterface {
	public void method(); //추상메소드
	default void defaultMethod() {} //디폴트메소드
	//public void method2(); //2개가 되면 에러발생!
	
}
