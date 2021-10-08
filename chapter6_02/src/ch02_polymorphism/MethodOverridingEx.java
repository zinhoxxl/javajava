package ch02_polymorphism;

public class MethodOverridingEx {
   static void paint(Shape p) {
	   p.draw();
   }
	
	
	public static void main(String[] args) {

		Line line = new Line();
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
		
	}

}
