package ch02;

public class Calculator {
	String model = "00001";
	double result = 0;
	
	public void getCalc(String op, int x, int y) {
		switch(op) {
		case "+": result = add(x,y);
			      System.out.println(add(x,y)); break;
		case "-": result = sub(x,y);
			      System.out.println(add(x,y)); break;
		case "x": result = mul(x,y);
			      System.out.println(add(x,y)); break;
		case "/": result = div(x,y);
			      System.out.println(add(x,y)); break;
		
		
		}
	}

	public int add(int x, int y) { return x+y; }
	public int sub(int x, int y) { return x-y; }
	public int mul(int x, int y) { return x*y; }
	public double div(int x, int y) { return x / (double)y; }
	
	}
	

