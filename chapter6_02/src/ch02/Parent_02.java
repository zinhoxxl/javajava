package ch02;

public class Parent_02 {

	void method1 () {}
	// final메소드 - 자식클래스에서 재정의 불가
	final void method2() {System.out.println("hello");}
	
	
}

class Child1 extends Parent{
	// 재정의
	void method1 () {System.out.println("재정의");}
    
	//재정의 불가
    //void method2 () {""}

}