package ExamChapter6_15;

public class MemberServiceExample {  // 15번 확인문제 (2)

	public static void main(String[] args) {

		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong","1234");
		
		if(result) {
			System.out.println("로그인 완료");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}

}
