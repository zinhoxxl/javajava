package ch02_Objects.copy;

import java.util.Objects;

public class EqualsAndDeepEqualsEx {
	public static void main(String[] args) {

		// intŸ���� ��üȭ �� Ŭ����
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		// �� ��ü�� ����
		System.out.println(Objects.equals(o1,o2));
		
		// �� ��ü�� �ʵ峻�뵵 ����
		System.out.println(Objects.deepEquals(o1,o2));
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		
		// �� ��ü�� ����
		System.out.println(Objects.equals(arr1, arr2));
		
		// �� ��ü�� �ʵ峻�뵵 ����
		System.out.println(Objects.deepEquals(arr1, arr2));
	}

}
