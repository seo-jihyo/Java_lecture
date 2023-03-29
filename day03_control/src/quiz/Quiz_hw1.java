package quiz;

import java.util.Scanner;

public class Quiz_hw1 {
	public static void main(String[] args) {
		
		System.out.println("비교할 정수 3개를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int tmp;
		
		if(b > a && b > c) {
			tmp = a;
			a = b;
			b = tmp;
			
		}else if(c > a && c > b) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if(c > b) {
			tmp = b;
			b = c;
			c = tmp;			
		}
		
		System.out.println(a+" > "+b+" > "+c);
		
		
		/*	int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int tmp;
		
		if (x < y) {
			tmp = y;
			y = x;		
			x = tmp;
		}
		if (x < z) {
			tmp = z;
			z = x;		
			x = tmp;
		}
		if (y < z) {
			tmp = z;
			z = y;		
			y = tmp;
		}
			System.out.println(x+" > "+y+" > "+z);
		}
	
*/
		
}
}
