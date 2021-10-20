package chapter15_09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // �ְ� ������ ���� ���̵� ����
		int maxScore = 0; // �ְ� ���� ����
		int avgScore = 0; // ���� �հ� ����(���)

		// ����
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // key,value��� ���� ����
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			avgScore += entry.getValue();
		}
		System.out.println("�������:" + avgScore / map.size());
		System.out.println("�ְ�����:"+maxScore);
		System.out.println("�ְ������� ���� ���̵�:" + name);
	}
}
