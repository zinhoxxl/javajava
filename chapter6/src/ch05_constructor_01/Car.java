package ch05_constructor_01;

public class Car {
	//�ʵ�
	String model;
	String color;
	int maxSpeed;
	
	//������
	//Ŭ������ (�Ű�����1, �Ű�����2, �Ű�����3){}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
/* �����ڰ� �����ϹǷ� Ŭ�������Ͽ� �⺻�����ڸ� �߰����� ����.
Car(){} <-X �⺻�����ڸ� �߰����� ����
String model;
String color;
int maxSpeed;
Car(String model, String color, int maxSpeed) {
this.model = model;
this.color = color;
this.maxSpeed = maxSpeed;
 */
