package ExamChapter6_15;

public class MemberService2 {

	public static void main(String[] args) {
		MemberService m = new MemberService();
		boolean result = m.login("hong", "12345");
		if (result) { // if(result==true)
			System.out.println("�α���");
			m.logout("hong");
		} else {
			System.out.println("id,pwdȮ�����ּ���");
		}

	}

}

class MemberService {

	boolean login(String id, String password) {
		boolean result = false;
		if (id.equals("hong") && password.equals("12345"))
			result = true;
		else
			result = false;
		return result;
	}

	void logout(String id) {

		if ("hong".equals(id))
			System.out.println(id + "�� �α׾ƿ� �Ǿ����ϴ�.");
	}

}