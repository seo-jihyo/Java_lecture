package ex01.thread;

public class UserThread extends Thread {
	String name;
	public UserThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
//		System.out.println("UserThread Constructor " + name);
	}
	
	@Override
	public void run() { //Thread 실행 구현부
		for (int i = 1; i <= 10; i++) {
			if(i == 3) {
				try {
					sleep(1000);// 1/1000 = 1초 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			System.out.println(name);
			}//if end
			System.out.println(i);
		}// for end
	}
}
