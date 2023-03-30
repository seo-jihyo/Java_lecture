package quiz;

import java.util.Scanner;

public class Quiz_year {
	public static void main(String[] args) {
		System.out.println("연도를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		

		
		if ((year % 400 == 0) || (year % 4 == 0) && ((year % 100 != 0))) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}
}
