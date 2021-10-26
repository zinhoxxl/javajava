package ch03;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample2 {
	public static void main(String[] args) {
		IntBinaryOperator operator;

		// 정적메소드 참조 static
		operator = new IntBinaryOperator() {

			@Override
			public int applyAsInt(int x, int y) {
				return Calculator.staticMethod(x, y);
			}
		};
		System.out.println("결과:" + operator.applyAsInt(3, 4));
		
		
		//람다식
		operator = (x,y) ->Calculator.staticMethod(x, y);
		

	}
}
