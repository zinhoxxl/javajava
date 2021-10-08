package ch02_polymorphism;

public class UsingOverride {

	public static void main(String[] args) {
		
		Shape start, last, obj;
		
		start = new Line();
		last = start;
		
		obj = new Rect();// Rect ��ü ����
		last.next = obj; 
		last.next = obj; 
		last = obj;
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		obj = new Circle(); // Circle ��ü ����
		last.next = obj;
		// Cirecl(0 ��ü�� next�� null
		// ��� ���� ���
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}

	} 

}
