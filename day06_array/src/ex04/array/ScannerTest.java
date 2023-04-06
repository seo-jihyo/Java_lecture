package ex04.array;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//next() vs nextline()
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String str = sc.next(); //공백 못받음
		String a = sc.next(); 
		sc.next(); sc.next();
		String b = sc.next(); //공백 처리 
		System.out.println( a + ", " + b);
		
		
		System.out.println(name + ", " + str);
	}
}
