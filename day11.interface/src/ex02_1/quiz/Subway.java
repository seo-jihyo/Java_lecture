package ex02_1.quiz;

public class Subway implements Trans{

	@Override
	public void start() {
		System.out.println("지하철 출발");
	}

	@Override
	public void stop() {
		System.out.println("지하철 정차");
	}

}
