package ex04.inheritance;

public class Shape {	 //super class

	protected int w, h;
	protected double result;
	
	public Shape() { //생성자. 멤버변수의 초기화 담당
		w = h = 0; result = 0;
	}

	public Shape(int w, int h) { // 생성자
		this.w = w;
		this.h = h;
	}
	
	//getter setter
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public double calc() {
		return result;
	}
	
	public void show() {
		System.out.println(w + ", " + h);
	}
}
