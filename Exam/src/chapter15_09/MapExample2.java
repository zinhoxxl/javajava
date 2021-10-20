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

		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장(평균)

		// 정답
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
		System.out.println("평균점수:"+totalScore / map.size());
		System.out.println("최고점수:"+maxScore);
		System.out.println("최고점수를 받은 아이디:"+name);
		
		/*---------------------------------------------------------*/
		
		
		
		
		
	}
}
