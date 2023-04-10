package ex03.inheritance;

public class Point {
	protected int x, y;
	public int getX() {
		return x;
	}
	//getter setter
	public void setX(int x) {
		this.x = x;
	
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//생성자 함수
	public Point() {
		//초기값
		x = y = 10;
//		System.out.println("default constructor");
	}

	public Point(int x){
		this(x,9);
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("x, y constructor");
	}
	
	
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println(x + ", " + y);

	}
	
//	class Circle extends Point{
//		새로 클래스 생성해도 됨
//	}
//	
}

