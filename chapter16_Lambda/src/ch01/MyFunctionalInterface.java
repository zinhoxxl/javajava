package ch01;

//�Լ��� �������̽� - �߻�޼ҵ尡 1���� �������̽�
@FunctionalInterface //�Լ�������ü�̽��� �ݵ�� �߻�޼ҵ尡 1���� �־����
public interface MyFunctionalInterface {
	public void method(); //�߻�޼ҵ�
	default void defaultMethod() {} //����Ʈ�޼ҵ�
	//public void method2(); //2���� �Ǹ� �����߻�!
	
}
