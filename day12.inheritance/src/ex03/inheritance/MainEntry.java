package ex03.inheritance;

public class MainEntry {
	public static void main(String[] args) {

//		Circle c = new Circle();
//		c.disp();
//		Circle c2 = new Circle(1, 2);
//		c2.disp();

//		Point pt = new Point();
//		pt.disp();   //초기값 츨력
//		Point pt2 = new Point(100);
//		pt2.disp();   
		
		Rect r1 = new Rect();
		r1.disp();
		
		Rect r2 = new Rect(5);
		r2.disp();
		
		Rect r3 = new Rect(20, 30);
		r3.disp();

	}
}
