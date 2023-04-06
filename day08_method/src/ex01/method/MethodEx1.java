package ex01.method;

import java.util.Scanner;

//매개변수 없고 리턴타입 있는 경우
public class MethodEx1 {
	public static int show() {
		System.out.println("show() method"); //show() method
		return 100;
	}
	public static void info() {
		
	}
	public static int max() {
		System.out.println("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
	//	if(x>y) return x;
	//	else return y;
		//return이 없으면 에러뜸
		
		int max = ( x > y) ? x : y; //위의 if문과 같음ㄴ
		return max;
	}
	

	
	public static void main(String[] args) {
		System.out.println("max= " + max());
		show(); //함수 호출 show() method
		System.out.println(show());
		int num = show();
		System.out.println(num); //100
	}
}
//return type은 출력의 책임이 호출한 쪽에 있다.