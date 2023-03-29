package ex03.operator;

import java.util.Scanner;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//논리연산자: &, &&(and), |, |(or), ^(xor), !
/*		
		int x = 10;
		int y = 20;
		int z = 30;
		
		//10진 논리 결과 --> T/F
		//2진 논리 결과 --> 값
		
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		
		boolean flag = false;
		
//		flag = (x < y) && (y < z);
		flag = (x > y) && (y < z);	//&&연산일 때 앞의 값이 거짓이면 뒤는 수행하지 않는다.
		System.out.println(flag);
		
		flag = (x < y) || (y < z);	//||연산일 때 앞의 값이 참이면 뒤는 수행하지 않는다.
		System.out.println(flag);
		
		System.out.println(flag);
		
		System.out.println(!flag);
*/		
		
		//삼항(저건) 연산자 :(조건) ? 참: 거짓;	
//							1	  2 	3
		int x, y, z, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data 2 = ");
		
//		if(sc.nextInt() > sc.nextInt()) {
		x = sc.nextInt();
		y = sc.nextInt();
		
//		if (x > y) result = x;
//		else result = y;
		
		result = (x > y) ? x : y;
		
		System.out.println("max = " + result);
		
		String str = null;
		System.out.println("year = ");
		int year = sc.nextInt();
		
		//if 판정?
		str = (year == 2000) ? "맞아" : "틀려";
		
		System.out.println(year + "년도: " + str);
		
							
		
	}
}
