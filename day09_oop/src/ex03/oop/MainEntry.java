package ex03.oop;

//3과 5로 결과 출력하기
public class MainEntry {
	public static void main(String[] args) {
		
		//rec class 
		
		Rectangle r = new Rectangle();
		r.display(); //초기값
		r.setX1(1);
		r.setX2(2);
		r.setY1(3);
		r.setY2(4);
		r.display();
		
		//point
		System.out.println("===========================");
		Point p = new Point();
		p.display();  //초기값
		p.setX(3);
		p.setY(5);
		p.display();
		
		
		//한번에 찍기  (유지보수에는 분리에서 입력하는 게 좋다)
		p.setXY(2, 5);
		p.display();
	}
	
}
