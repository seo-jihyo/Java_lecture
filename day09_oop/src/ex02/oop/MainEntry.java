package ex02.oop;
import java.lang.*;  //자동 임포트
	
class Point {		//extends Object { //object class 상속받고 있었음
//	int x, y;		//멤버 변수 - 접근지정자 : private < default < protected < public
	private int x, y;		 //point 클래스의 클래스변수 (class 내에서만 사용)
//	default int x, y;		 //같은 패키지 내에서 접근 가능
//	protected int x, y;		 //패키지가 달라도 접근 가능
	
	public int getX() {
		return x;
	}
	public void setX(int xx) {
		x = xx;
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int yy) {
		y = yy;
}
	public void display() {
		System.out.println(x + ", " + y);
	}
}//point end

class A{
	
}
class B{
	
}
public class MainEntry { //public은 한곳에만 붙어야 한다.
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println(pt.getX());
		pt.setX(1000);
		System.out.println(pt.getX());
//		System.out.println(pt.x); //private는 다른 클래스에서 못 씀
//		System.out.println(pt.);\
		pt.display();
//		int xx ;
//		System.out.println(xx);
	}
}//MainEntry end