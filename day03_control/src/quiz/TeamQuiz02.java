package quiz;

import java.util.Scanner;

public class TeamQuiz02 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		if (score >= 0 && score <= 100) {

			switch (score / 10) {
			case 10: 
			case 9: 
			case 8: System.out.println("상");	break;			
			case 7: 
				if (score >= 75) {
					System.out.println("상");	break;
				}else 
					System.out.println("보통");	break;
			case 6:  System.out.println("보통");	break;			

			default:
				System.out.println("노력하세요."); 
			}

		} else System.out.println("잘못된 점수를 입력하셨습니다.");

	}
}
