package ch05_constructor_03_02;

public class Car {
	
	// �ʵ�
	String model;
	String color;
	int maxSpeed;
	
	// ������
	// ���� Ŭ���������� �ٸ� ������ ȣ���
	// this()�޼ҵ� ȣ��
	// ���ǻ���!!! - �ݵ�� ȣ���ϴ� �������� ù ���ο� �����ؾ���.~!!!
	Car() {
		   this("�׷���","���",200);
	};
	Car (String model) {
	    // default������ ȣ��
		this.model = model;
		System.out.println("�� ���� �������?");
		
	} 
	
	Car (String model, String color) {
		this(model);
		this.color = color;
		System.out.println("�Ű����� �ΰ�¥�� �������?");
		
	}  
	
	Car (String model, String color, int maxSpeed) {
		this(model,color);
		this.maxSpeed = maxSpeed;
		System.out.println("�Ű����� ����¥�� �������?");
	} 
	

}
