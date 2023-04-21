package ex01.thread;

public class MainEntry {
	public static void main(String[] args) {
//		Thread t1 = new Thread("t1");
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
		t1.setPriority(Thread.MIN_PRIORITY); //1
		t2.setPriority(Thread.NORM_PRIORITY); // 5 
		t3.setPriority(Thread.MAX_PRIORITY);//10
		
		System.out.println(Thread.currentThread().getName());
		
		t1.run(); 
		//run()메서드 실행이 아님 그냥 명시적으로 호출한 것
		t1.start(); //run() 메서드 유도
		t2.start(); //run() 메서드 유도
		t3.start(); //run() 메서드 유도
	}
}
