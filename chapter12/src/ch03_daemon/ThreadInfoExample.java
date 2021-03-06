package ch03_daemon;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	public static void main(String[] args) {

      AutoSaveThread autoSaveThread = new AutoSaveThread();
      autoSaveThread.setName("AutoSaveThread");
      autoSaveThread.setDaemon(true);
      autoSaveThread.start();
      
      // 현재 실행중인 Thread들의 정보 얻기
      Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
      // Thread정보만 추출
      Set<Thread> threads = map.keySet();
	  // 
      for(Thread thread : threads) {
		  System.out.println("Name:"+thread.getName()+(thread.isDaemon()?"(데몬)":"(주)"));
		  System.out.println("\t"+"소속 그룹:"+thread.getThreadGroup().getName()); // 그룹
		  System.out.println();
	  }
	
	}
}
