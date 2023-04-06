package ex01.method;

public class MainEntry {
	//매개변수 있고 리턴타입 없는 경우
	public static void plus(int x , int y, String msg) {
		System.out.println("hap = " + (x+y));
		int sum = x + y;
		System.out.println("sum = " + sum);
		System.out.println(x + ", " + y + ", " + msg);
	}
	public static void abs(int x) {
		if(x<0) x = -x;
		System.out.println("절대값: ");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		plus(10, 20,"hello");
	//	plus(10, 20);
		line();
		info();
		line();
		System.out.println("main end");
	}
	
//1) 매개변수 없고, 리턴타입 없는 경우
	public static void info() {
		System.out.println("jihyo");
	}
	public static void line() {
		System.out.println("----------------------------------------");
	}
}
