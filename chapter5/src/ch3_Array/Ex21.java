package ch3_Array;

public class Ex21 {

	public static void main(String[] args) {

		// ����Ÿ��(String) 1���� �迭 ����
		String[] snake = { "������", "�ȷ���", "ĥ����", "������", "������" };
		

		for (int i = 0; i < snake.length; i++)
			System.out.print(snake[i] + "  ");
		System.out.println();

		for (int i = (snake.length - 1); i >= 0; i--)
			System.out.print(snake[i] + "  ");
		System.out.println();
		
		// ���� for���� �̿��Ͽ� ���
		for(String n : snake)
			System.out.print(n);
		System.out.println();

	}

}
