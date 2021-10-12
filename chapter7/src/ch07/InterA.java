package ch07;

public interface InterA {
	
	// 추상메소드
	void method();

}

// 추상메소드를 포함하는 추상 클래스
abstract class A implements InterA {
	// 추상메소드로 선언(추상메소드로 재정의)
	public abstract void method();
	
}
class B extends A {

	@Override
	public void method() {} // 실행부
	
}