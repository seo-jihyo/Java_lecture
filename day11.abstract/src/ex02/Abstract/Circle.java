package ex02.Abstract;

public class Circle extends Shape {
	// 추상 클래스를 상속 받은 것들은 추상 메서드를 오버라이드 해야 함
	@Override
	public double calc(double x) {
		result = x * x * Math.PI;
		return result;
	}

	@Override
	public void show(String name) { //매개 변수를 가진 형태
		calc(5.5);
		System.out.println(result + "반지름의 " + name + "이 그려졌습니다.");
	}
}
