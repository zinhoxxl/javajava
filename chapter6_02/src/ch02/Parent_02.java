package ch02;

public class Parent_02 {

	void method1 () {}
	// final�޼ҵ� - �ڽ�Ŭ�������� ������ �Ұ�
	final void method2() {System.out.println("hello");}
	
	
}

class Child1 extends Parent{
	// ������
	void method1 () {System.out.println("������");}
    
	//������ �Ұ�
    //void method2 () {""}

}