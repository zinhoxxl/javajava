package ch01;

public class ClassCatExceptionEx {
	public static void main(String[] args) {

		try {
		Animal animal = new Cat();
		Cat cat = null;
		// System.out.println(cat.toString());
		Dog dog = (Dog)animal; // ���� �߻� - ���α׷� ���Ḧ �������� try{}catch(){} ���
		
		// ���� �߻��� �Ʒ� ��ɹ� ���� ����
		System.out.println("����ȯ ó��");
		} catch(ClassCastException e) {
			System.out.println("����̴� ���� �ɼ� �����ϴ�.");
		}finally {
			// ��ɹ� ����
			System.out.println("���α׷� ����");
		}
	}
}
			

