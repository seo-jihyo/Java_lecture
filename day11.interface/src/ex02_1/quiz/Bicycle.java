package ex02_1.quiz;

public class Bicycle implements Trans {
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("자전거 출발");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("자전거 정차");
	}
}
