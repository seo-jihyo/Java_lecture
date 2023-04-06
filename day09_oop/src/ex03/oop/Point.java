package ex03.oop;

public class Point {
	//객체 생성
	private int x, y;
	
	//getter/setter method
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
	
	//한번에 찍기
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//출력
	public void display() {
		System.out.println(x + ", " + y+ ", ");
	}
	
}
//output