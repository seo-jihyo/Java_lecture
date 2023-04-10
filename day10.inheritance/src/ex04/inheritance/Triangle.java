package ex04.inheritance;

import java.util.Scanner;

public class Triangle extends Shape {
	public Triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("넓이 = ");
		this.w = sc.nextInt();
		System.out.println("높이 = ");
		this.h = sc.nextInt();
		
		

	}
	public double calc() {
		this.result = ((w * h)/2.0);
		return result;
	}
	public void show() {
		System.out.println("삼각형의 너비: " + calc());
	}
}
