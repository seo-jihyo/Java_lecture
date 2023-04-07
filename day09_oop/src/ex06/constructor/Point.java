package ex06.constructor;

public class Point {
	private int x, y;  //멤버 변수
	//getter setter

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//생성자함수 3개
	public Point() {
		System.out.println("default constructor");
		x = 4;
		y = 3;
	}
	public Point(int Y) {
		System.out.println("1 constructor");
		x = 2;
		this.y = y;
	}
	public Point(int x, int y) {
		System.out.println("2 constructor");
		this.x = x;
		this.y = y;
	}
	//output함수
	public void display() {
		System.out.println(x + ", " + y);

	}
}
