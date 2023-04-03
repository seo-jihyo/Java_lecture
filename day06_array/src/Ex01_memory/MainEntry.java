package Ex01_memory;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int x=3, y=5;
		double d = 12.34;
		char ch = 'A';
		
		String s1 = new String("kosa");
		String s2 = new String("daebo");
		
		System.out.println("int data input: ");
		Scanner sc = new Scanner(System.in);
		
		int  z = sc.nextInt();
		System.out.println(z);
		System.out.println(x+","+y+","+d+","+ch);
	}
}
