package ex02.Abstract;

public abstract class Shape { //Super class
	//추상 클래스는 추상 메서드, 일반 메서드(블럭이 있는 메서드) 둘 다 가진다.
	double result = 0;
	
	public abstract double calc(double x); // abstract method
	public abstract void show(String name);
	public void View() {
		System.out.println("Super class Shape");
	}
}
