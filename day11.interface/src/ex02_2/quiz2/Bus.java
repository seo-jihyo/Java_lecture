package ex02_2.quiz2;

public class Bus implements Trans{
	private double speed = 0;
	
	@Override
	public void move() {
		while(speed < 5) {
			speed += (acclerator * 5);
			System.out.println("Accelerting..." + speed);
			
			try {
				Thread.sleep(500); //1/1000 -> 1초 , 500 -> 0.5초 멈춤
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}// while end
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Emergency stop...");
	}


}
