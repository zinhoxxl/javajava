package ExamChapter6_18;

public class ShopServiceExample {

	public static void main(String[] args) {

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		System.out.println(obj1 == obj2?"������ü":"�ٸ���ü"); 
//		{
//			System.out.println("���� ShopService ��ü �Դϴ�.");
//		} else {
//			System.out.println("�ٸ� ShopService ��ü �Դϴ�.");
//		}

	}

}

class ShopService { // 18�� Ȯ�ι��� ����  (�̱��� ����)
    private static ShopService instance = new ShopService();
	private ShopService() {}   // �ܺ� ���ٹ��
	
	public static ShopService getInstance() {
		if(instance==null) instance = new ShopService();
		return instance;
	}
	
}
