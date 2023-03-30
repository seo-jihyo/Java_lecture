package quiz;

import java.util.Scanner;

//[과제2] 사칙연산 프로그램 작성(예외처리)
//숫자 2개 입력받고 연산자 (+, -, *, /) 1개 입력받아서 result
public class Quiz_hw2 {
	public static void main(String[] args) {
		System.out.println("두 수와 연산자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char op = sc.next().charAt(0);
		
		if (op == '+') System.out.println(a + b); 
		else if (op == '-') System.out.println(a - b); 
		else if (op == '*') System.out.println(a * b); 
		else System.out.println((double)a / b); 
	
	}
}
