package ex_01.If;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		String str  = "";
		System.out.println("integer data input : ");
		
		int su = new Scanner(System.in).nextInt();
		
		//if( su % 2 == 0 ) System.out.println("even");
		//else System.out.println("odd");
		
		//삼항연산자
		str = ( su % 2 == 0) ? "even" : "odd";
		
		//양수, 음수, 0 판정 if
		if( su > 0) System.out.println("양수");
		else if( su < 0 ) System.out.println("음수");
		else System.out.println("0이넹");
	}
}
