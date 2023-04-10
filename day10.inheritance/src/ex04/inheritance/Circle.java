package ex04.inheritance;

import java.util.Scanner;

public class Circle extends Shape { //sub class (자손 클래스)

	public Circle() {
		super(2, 3); // 반드시 첫번째 줄에 와야 한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 값 ? ");
		this.w = sc.nextInt();
		
	}
	public double calc() {
		this.result = (w * w * Math.PI);
		return result;
	}

	public void show() {
		System.out.println("반지름: " + w + ", 원의 너비: " + calc());
	}
	public void line() {
		System.out.println("-------------------------------");
	}
}
