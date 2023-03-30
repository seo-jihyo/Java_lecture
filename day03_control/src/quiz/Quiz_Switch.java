package quiz;

import java.util.Scanner;

public class Quiz_Switch {
	public static void main(String[] args) {
		System.out.println("당신이 받은 점수는? ");
		int score = new Scanner(System.in).nextInt();
		char grade = ' ';
		
		switch (score / 10) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;		
		case 6 :
			grade = 'D';
			break;
		
		default :
			grade = 'F';
			break;
		}		
			System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}
