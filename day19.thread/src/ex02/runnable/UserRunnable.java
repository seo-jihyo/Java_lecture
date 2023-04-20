package ex02.runnable;

public class UserRunnable implements Runnable {
	String name;

	public UserRunnable(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
				try {
					Thread.sleep(2000);// 1/1000 = 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			} // if end
			System.out.println(i);
		} // for end

	}

}
