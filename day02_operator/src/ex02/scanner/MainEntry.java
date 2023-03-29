package ex02.scanner;

import java.util.Scanner;

//import java.lang.*;	//내부적으로 자동 임포트

public class MainEntry {
	public static void main(String[] args) {

		//표준 입력 : System.in
		Scanner sc = new Scanner(System.in); //객체 생성, 메모리 할당, 생성자함수 자동 호출
		System.out.print("정수 데이터 입력 요망 : ");
		int su = sc.nextInt();
		
		System.out.println("\n\n입력받은 수 : " + su);
	}
}
