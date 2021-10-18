package ch02_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// "apple"-"���", "pear"-"��", "peach"-"������",
		// "puppy"-"������", "cow"-"��", "zebra"-"��踻", "chicken"-"��"
		// Map�� ���� ��
		// scanner�� ������ �Է¹޾Ƽ� �ش��ϴ� �ѱ��� ���
		// map�� Ű�� ������ �ٽ� �Է��ϵ���
		// �������� "end"�� �ԷµǸ� ����;

		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "���");
		dictionary.put("pear", "��");
		dictionary.put("peach", "������");
		dictionary.put("puppy", "������");
		dictionary.put("cow", "��");
		dictionary.put("zebra", "��踻");
		dictionary.put("chicken", "��");
		dictionary.put("cat", "�����");

		while (true) { // Ư�� Ű�� �����ϴϱ� �ݺ��� �Ⱦ��� �ϸ� ��

			// ��ȸ�� �ܾ�
			System.out.println("��ȸ�� ���ܾ �Է��ϼ���>");
			String key = sc.next();
			if (!key.equals("end")) {
				if (dictionary.containsKey(key)) { // key�� �ִ��� Ȯ���ϰ�
					System.out.println(dictionary.get(key));
				}else {
					System.out.println("�ش��ϴ� �ܾ �����ϴ�.");
				}

			} else
				break;

		}//
		System.out.println("����");

	}
}
