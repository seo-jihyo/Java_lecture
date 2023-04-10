package ex02.Abstract;

public class Triangle extends Shape {
	
	int h = 5;
	
	@Override
	public double calc(double x) {
		result = (x * h) / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(6.6);
		System.out.println(result + " 크기의 " + name +"이 그려졌습니다.");
	}

}
