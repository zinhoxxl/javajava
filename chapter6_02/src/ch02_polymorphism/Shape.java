package ch02_polymorphism;

public class Shape {
	// ÇÊµå
	public Shape next;
	protected String name;

	// »ı¼ºÀÚ
	public Shape() {
		next = null;
	}

	// ¸Ş¼Òµå
	public void draw() {
		System.out.println("Shape");}
	
	public void paint() {draw();}
} 



class Line extends Shape { 
	public void draw() {
		System.out.println("Line");
	}
}
	class Rect extends Shape {
		public void draw() {
			System.out.println("Rect");
		}
	}

	class Circle extends Shape {
		public void draw() 
		  { name= "Circle";  // ÀÚ½ÄÅ¬·¡½º¿¡¼­ ÀçÇÒ´çµÈ °ª
			System.out.println("Circle");
			super.name="Shape"; // ºÎ¸ğÇÊµå Á¢±Ù - Á¤Àû ¹ÙÀÎµù
			super.draw(); // ºÎ¸ğ¸Ş¼Òµå È£­„ - Á¤Àû ¹ÙÀÎµù
			System.out.println(name);
		}
	}

	
	
	
	