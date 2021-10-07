package ExamChapter6_18;

public class ShopServiceExample {

	public static void main(String[] args) {

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		System.out.println(obj1 == obj2?"같은객체":"다른객체"); 
//		{
//			System.out.println("같은 ShopService 객체 입니다.");
//		} else {
//			System.out.println("다른 ShopService 객체 입니다.");
//		}

	}

}

class ShopService { // 18번 확인문제 정답  (싱글톤 문제)
    private static ShopService instance = new ShopService();
	private ShopService() {}   // 외부 접근방어
	
	public static ShopService getInstance() {
		if(instance==null) instance = new ShopService();
		return instance;
	}
	
}
