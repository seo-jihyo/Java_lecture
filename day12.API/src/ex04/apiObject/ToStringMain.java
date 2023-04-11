package ex04.apiObject;

class Rectangle{ //extends object 생략
	int x, y;
	public void disp() { //출력 메서드  따로 만들었음
		System.out.println(x + ", " + y);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "Rectangle [x=" + x + ", y= " + y + "]";
	}
	
	
//	public String toString() {
//		return x + "," + y;
//	}
	
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
//		r.disp();
		System.out.println(r.toString()); //tostring 안하면 주소가 나옴
	}
}
