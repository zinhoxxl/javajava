package ch02_priority;

// 스레드의 우선순위 - 생성시 5, 1이면 가장낮은 우선순위, 10이면 가장 높은 우선순의
public class PriorityExample {
	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread"+i);
			System.out.println("생성시 스레드우선순위:"+thread.getPriority());
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY); // 우선순위 변경
			} else { 
				thread.setPriority(Thread.MAX_PRIORITY); // 우선순위 변경
			}
            thread.start(); // 스레드 실행
            System.out.println("스레드우선순위:"+thread.getPriority());
		}
		
	}
}
// 스레드만들어서 실제로 사용할 일은 거의 없을것이다