package quiz;
import java.util.Scanner;
public class Quiz_사칙연산함수 {
	//plus(1,2), mul(1*2), no return sub(-), div( / ) return type o
	public static void plus(int x, int y) {
		System.out.println("plus: " + (x+y));
	}
	public static void mul(int x, int y) {
		System.out.println("mul: " + (x*y));
	}
	public static int sub(int x, int y) {
		System.out.println("sub: " + (x-y));
		return x-y;
	}
	public static int div(int x, int y) {
		try {
			return x / y;
		} catch (Exception e) {
			System.out.println("div: 0으로 나눌 수 없음");
			// TODO: handle exception
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("div: " + (x/y));
		return x/y;
	}
	
	public static void main(String[] args) {
		//함수 호출
		Scanner sc = new Scanner(System.in);
		System.out.println("x,y=");
		int x =  sc.nextInt();
		int y =  sc.nextInt();
		
		plus(x,y);
		mul(x,y);
		sub(x,y);
		div(x,y);
	}
}
