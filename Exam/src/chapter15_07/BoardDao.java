package chapter15_07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao { // ���� �κ�

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("����1","����1"));
		list.add(new Board("����2","����2"));
		list.add(new Board("����3","����3"));
		return list;
	}
	
}
