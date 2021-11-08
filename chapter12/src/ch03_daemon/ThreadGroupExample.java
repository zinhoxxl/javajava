package ch03_daemon;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
	   
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main ������ �׷��� list() �޼ҵ� ��� ����]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try {Thread.sleep(3000);}catch(Exception e) {}
		
		System.out.println("[myGroup ������ �׷��� interrupt()�޼ҵ� ȣ��");
		myGroup.interrupt();//�׷���� ���ͷ���
	}
}