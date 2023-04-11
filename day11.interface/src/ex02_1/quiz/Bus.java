package ex02_1.quiz;

public class Bus implements Trans {
	@Override
	public void start() {
		System.out.println("버스 출발");
	}

	@Override
	public void stop() {
		System.out.println("버스 정차");
	}
}
