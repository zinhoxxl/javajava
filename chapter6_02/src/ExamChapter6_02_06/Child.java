package ExamChapter6_02_06;

public class Child extends Parent {

	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		super();
		this.name = name;
		System.out.println("Child(String name)call");
	}
	
	
}
