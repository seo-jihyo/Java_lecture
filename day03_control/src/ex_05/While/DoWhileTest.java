package ex_05.While;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int su;
		char grade = ' ';
		
		do {
			System.out.println("당신의 점수 입력 요망");
			su = new Scanner(System.in).nextInt();
		} while (su < 0 || su > 101);
		
		System.out.println("점수: ");
		su = new Scanner(System.in).nextInt();
		
		//switch 예시로 변경
		switch (su / 10) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F'; break;
		
		}
		System.out.println("당신의 점수  "+su+" ==> " + grade + "학점");
	}
}
