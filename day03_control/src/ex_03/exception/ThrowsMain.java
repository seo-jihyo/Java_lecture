package ex_03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {
	public static void main(String[] args) throws Exception{ //예외 던지기
	
		int x = 0, y, result;
		
		System.out.println("x, y= ");
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		result = x / y;		//에러 발생할 수 있음.

		System.out.println(result);
	
	}
}
