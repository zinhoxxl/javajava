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

		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수 저장
		int avgScore = 0; // 점수 합계 저장(평균)

		// 정답
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // key,value묶어서 같이 추출
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			avgScore += entry.getValue();
		}
		System.out.println("평균점수:" + avgScore / map.size());
		System.out.println("최고점수:"+maxScore);
		System.out.println("최고점수를 받은 아이디:" + name);
	}
}
