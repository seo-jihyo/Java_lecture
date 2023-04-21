package ex06.Synchronized;

class Atm {
	private int money;

	public Atm(int money) { // 인자 값이 있는 생성자 함수
		this.money = money;
		// TODO Auto-generated constructor stub
	}

	// 입금합수
	public void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금 금액 " + amount);
	}

	// 출금함수
	public void withdraw(int amount, String name) {
		synchronized (this) {

			if ((money - amount) > 0) {
				Thread.yield();
				money -= amount;
				System.out.println(name + " : 출금 금액 " + amount);
			} else {
				System.out.println(name + " : 출금 불가 잔액이 부족합니다.");
			}
		} //end synchronized
	}

	// 통장 잔고 함수
	public void getMoney() {
		System.out.println("                            잔액은: " + money);
	}

}// Atm end

class UserAtm extends Thread {
	Atm obj;
	boolean flag = false;

	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj = obj;
	}

	@Override
	public void run() { // 스레드 실행부 (구현부)
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (flag) {
				obj.deposit((int) (Math.random() * 10 + 2) * 100, getName());
			} else {
				obj.withdraw((int) (Math.random() * 10 + 2) * 100, getName());

			} // if end
			flag = true;
			obj.getMoney();
		} // for end
	}// run end
}// UserAtm end

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "망고");
		UserAtm user2 = new UserAtm(at, "아빠");
		UserAtm user3 = new UserAtm(at, "지효");

		user1.start();
		user2.start();
		user3.start();
	}
}
