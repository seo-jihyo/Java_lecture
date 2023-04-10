package ex03.Abstract;

public class Airplane extends Trans {
	@Override
	public void start(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+ " 출발");
	}

	@Override
	public void stop(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 정지");
	}
}
