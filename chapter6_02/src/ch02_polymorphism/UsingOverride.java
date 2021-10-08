package ch02_polymorphism;

public class UsingOverride {

	public static void main(String[] args) {
		
		Shape start, last, obj;
		
		start = new Line();
		last = start;
		
		obj = new Rect();// Rect 객체 연결
		last.next = obj; 
		last.next = obj; 
		last = obj;
		obj = new Line(); // Line 객체 연결
		last.next = obj;
		last = obj;
		obj = new Circle(); // Circle 객체 연결
		last.next = obj;
		// Cirecl(0 객체의 next는 null
		// 모든 도형 출력
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}

	} 

}
