package ch3_Array2;

public class A {

	// Ÿ��[] ������;
	// String[] args
	// main()�޼ҵ���
	// �Ű������κ�()�� ���� �迭String[] args
	// �� ���̰� ������ �������� �迭
	// argument�� ������ŭ String[] �迭�� �����Ǿ ����.
	// java A hello world my name is jinho
	// => String[] args= {hello, world, my, name, is, jinho};
	public static void main(String[] args) { // argument, ����, �Ű����� �κ�

		System.out.println("�迭�� ����:" + args.length);
		System.out.println("�迭�� ù��° ��:" + args[0]);
		System.out.println("�迭�� �ι�° ��:" + args[1]);

		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);
	}

}
