package ex03.inheritance;

public class Circle extends Point{  //sub class
	private int r;
	
	
	public Circle() {
		this.r = 5;
		System.out.println("default constructor");
	}
	
	
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
//		super(x, y);   //부모의 싱성자함수 의미
		this.r = 55;
	}


	//output
	public void disp() {
		System.out.println(x + ", "+ y + ", " + r);
		super.disp();  //super가 없으면 자기 자신 부른 것과 같음
//		System.out.println(", " + r);
	}
}
