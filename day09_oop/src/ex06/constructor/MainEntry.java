package ex06.constructor;

public class MainEntry {
	public static void main(String[] args) {
		
		Point p = new Point();
		p.display(); //초기값 4,3 출력
		           
		
		
		Point p1 = new Point(1,0);
		p1.display();
		Point p2 = new Point();
		p2.display();

	}
}
