package chapter15_09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // �ְ� ������ ���� ���̵� ����
		int maxScore = 0; // �ְ� ���� ����
		int totalScore = 0; // ���� �հ� ����(���)

		// ����
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
        while(it.hasNext()) {
        	String key = it.next();
        	int value = map.get(key);
        	totalScore += value;
        	
        	if(maxScore < value) {
        		maxScore = value;
        	    name = key;
        	}
        }
		System.out.println("�������:"+totalScore / map.size());
		System.out.println("�ְ�����:"+maxScore);
		System.out.println("�ְ������� ���� ���̵�:"+name);
		
		/*---------------------------------------------------------*/
		
		
		
		
		
	}
}
