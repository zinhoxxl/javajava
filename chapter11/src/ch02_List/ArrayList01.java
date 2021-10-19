package ch02_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {
	public static void main(String[] args) {

		
		//List �������̽� Ÿ���� ���� ���� = ArrayList��ü ����
		List<String> list = new ArrayList<>();
		// ����ȭ ó��
	    list = Collections.synchronizedList(list);
		
		// ��ü �߰� �޼ҵ� add(��ü);
		list.add("Hello");
		list.add("hi");
		list.add("Java");
		
		//��ü�� ���� Ȯ�� size()
		int n = list.size();
		// int c = list.capacity(); - �޼ҵ� ���� / vector���� capacity�� ����
		System.out.println(n);
		
		//�߰� ���� add(index, ��ü)
		list.add(2, "shani");
		// list.add(5, "shani"); java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
		
		
		//��ü ���忩��Ȯ�� contains(��ü)
		System.out.println(list.contains("Java")?"Java������ �ֽ��ϴ�.":"Java������ �����ϴ�.");
		
		// ����� ��ü ��� get(index)
		String str = list.get(1);
		System.out.println(str);
		
		// ����� ��ü�� Object�迭�� ����
		Object[] strArr = list.toArray();
		for(Object s:strArr)
			System.out.print(s+" ");
		
		System.out.println();
		
		// ���� remove(index ��ȣ)
		list.remove(1);
		// size()������ ū index��ȣ�� ������ ���� �߻�
		// list.remove(4);// Exception in thread "main" java.lang.IndexOutOfBoundsException
		                                         //  : Index 4 out of bounds for length 3

		// ��� ����
		list.clear();
		
		System.out.println(list.isEmpty()?"����Ʈ�� ����ֽ��ϴ�.":"����Ʈ�� ������� �ʽ��ϴ�.");
		
		
	}
}
