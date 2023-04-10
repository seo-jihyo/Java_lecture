package ex01.Interface;

interface A { //interface - abstract, final field 만 갖는다.
	int x = 90;				// = final static int x = 90
	final int y = 777;
	char ch = 'A';
	
	// 추상 메서드 abstract 생략 가능 - 무조건 추상메서드임, 일반 메서드 가질 수 없음
//	public void show() {}  --> abstract는 몸체를 가질 수 없으므로 error
	public void show();		// = public abstract void show();
	public abstract void disp();
} // end of A

interface B{
	void view();
} //end of B

interface C {
	String name = "happy";
	public void draw();
} //end of C

interface D extends B{
	void dview();
	//D end
}
/////////////////////////////////////////////////////////////
class Rect implements D {

	@Override
	public void view() {  // from B interface
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dview() { // from D interface
		// TODO Auto-generated method stub
		
	}
	public int plus(int x, int y) {
		return x + y;
	}
} // Rect class
//////////////////////////////////////////////////////////////
class Shape{
	
} // Shape class

class Circle implements C{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
//		name = "jihyo"; // can not be assigned
		System.out.println(name + "님이네요.");
	}
	
}
class Multi extends Shape implements B, C, A{
				//클래스 먼저 쓴  다음 인터페이스 
	
	@Override
	public void show() { //A
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() { //A
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() { //C
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() { //B
		// TODO Auto-generated method stub
		
	}
	
}//Multi end
public class MainEntry {
	public static void main(String[] args) {
//		A a = new A();  class 가 아니므로 인스턴스 생성 불가
	}
}
