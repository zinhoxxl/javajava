package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
	public static void main(String[] args) {

		// 1 String 객체를 담는 List만들고
		// ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		// 2 "홍길동", "일지매", "임꺽정" 을 저장후 
		list.add("홍길동");
		list.add("일지매");
		list.add("임꺽정");
		
		// 3 갯수를 리턴하도록 작성
		int n = list.size();
		System.out.println(n);
		
		// 4 "이순신"이 들어있는지 확인
		System.out.println(list.contains("이순신")?" 들어있음.":"없음.");
		
		// 5 모든객체를 출력
		for(String s : list) // s <- 반복자
			System.out.println(s);
		
		// 6 index번호 2번에 해당하는 객체를 "유관순"으로 변경하세요
		list.set(2, "유관순");
		
		// 7 index번호 2번에 해당하는 객체를 출력하세요
		System.out.println(list.get(2));
		
		// 8 리스트내의 모든 객체를 삭제후 
        list.clear();
		
        // 9 리스트가 비어있는지 확인 메세지를 출력
		System.out.println(list.isEmpty()?"비어있음":"남아있음");
		
	}

}
