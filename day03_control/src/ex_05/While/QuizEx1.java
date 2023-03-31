package ex_05.While;

import java.util.Scanner;

//3과목 입력받기 ( 0-100) 이외는 재입력, 연산자(+-*/중 받아서 이외는 다시받기
public class QuizEx1 {
	public static void main(String[] args) {
		int a, b, result =0;
		char op = ' ';
		
		Scanner sc = new Scanner(System.in);
		
			do {
				System.out.println("a 점수를 입력해 주세요");
				a = sc.nextInt();
			} while (  a < 0 || a > 101);
			
			do {
				System.out.println("b 점수를 입력해 주세요");
				b = sc.nextInt();
			} while (  b < 0 || b > 101);
			
//			do {
//				System.out.println("c 점수를 입력해 주세요");
//				c = sc.nextInt();
//			} while (  c < 0 || c > 101);
			
			do {
				System.out.println("연산자를 입력하세요 (+, -, *, /)= ");
				op = sc.next().charAt(0);
				
	} while ( ( op != '+') && (op !='-') &&(op !='/') && (op !='*') );
	
		if (op == '+') { 
			result =  a + b;
		}
		else if  (op == '-') { 
			result =  a - b;
		}
		else if  (op == '*') { 
			result =  a * b;
		}
		else if (op == '/') {
			result =  a / b;
	}
	
		System.out.println("result= " + a + op + b + "=" + result);
	}
}
