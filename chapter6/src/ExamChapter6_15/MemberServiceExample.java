package ExamChapter6_15;

public class MemberServiceExample {  // 15�� Ȯ�ι��� (2)

	public static void main(String[] args) {

		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong","1234");
		
		if(result) {
			System.out.println("�α��� �Ϸ�");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
	}

}
