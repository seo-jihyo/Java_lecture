package ex04.quiz;

public class Bus extends Trans {
	
	int count = 0;

	@Override
	public void start() {
		// TODO Auto-generated method stub
		message = "부릉부릉"; 	
		System.out.println(message);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		message = "정차합니다";
		System.out.println(message);
	}
	@Override
	public void process() {
		// TODO Auto-generated method stub
		message = "집에가장~~";
		System.out.println(message);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				t.sleep(1000);
				switch (count) {
				case 0 :
					start();
					break;
				case 1 :
					process();
					break;
				case 2 :
					stop();
					break;
				}
				count++;
				if (count == 3) {
					break;
				}
			}
		} catch (Exception e) {
		}
	}

}
