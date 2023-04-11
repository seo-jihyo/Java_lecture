package ex02_1.quiz;

public class Airplane implements Trans{
	@Override
	public void start() {
		System.out.println("비행기 출발");
	}

	@Override
	public void stop() {
		System.out.println("비행기 정차");
	}
}
