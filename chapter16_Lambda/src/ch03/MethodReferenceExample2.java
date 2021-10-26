package ch03;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample2 {
	public static void main(String[] args) {
		IntBinaryOperator operator;

		// �����޼ҵ� ���� static
		operator = new IntBinaryOperator() {

			@Override
			public int applyAsInt(int x, int y) {
				return Calculator.staticMethod(x, y);
			}
		};
		System.out.println("���:" + operator.applyAsInt(3, 4));
		
		
		//���ٽ�
		operator = (x,y) ->Calculator.staticMethod(x, y);
		

	}
}
