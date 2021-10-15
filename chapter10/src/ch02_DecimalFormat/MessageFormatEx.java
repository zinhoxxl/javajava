package ch02_DecimalFormat;

import java.text.MessageFormat;

public class MessageFormatEx { // 이런게 있다...
	public static void main(String[] args) {

		String id = "Java";
		String name = "신용권";
		String tel = "010-123-4567";
		
		String text = "회원 ID:{0}\n 회원이름:{1}\n 회원전화:{2}";
		String result1 = MessageFormat.format(text, id, name, tel); // binding변수
		System.out.println(result1);
		
		// 순서대로 값이 매칭된다 활용빈도 낮음
		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {"'java'","'신용권'","'010-123-4567'"};
		String result2 = MessageFormat.format(sql, arguments);	
		System.out.println(result2);
		
	}

}
