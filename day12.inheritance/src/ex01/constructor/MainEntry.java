package ex01.constructor;

public class MainEntry {
	public static void main(String[] args) {

		Circle c1 = new Circle(1, 2, 3);
		c1.display();
		
		Circle c2 = new Circle();
		c2.display();
		
		Circle c3 = new Circle(3, 4);
		c3.display();
	}
}
