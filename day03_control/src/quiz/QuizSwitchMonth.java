package quiz;

import java.util.Scanner;

public class QuizSwitchMonth {
	public static void main(String[] args) {
	
		System.out.println(" input month");
		Scanner sc = new Scanner(System.in);
			System.out.println("month? ");
		
			int month = sc.nextInt();
			switch(month) {
				
			case 1:		case 3:		case 5: 	case 7:
			case 8:		case 10:	case 12:
					System.out.println(month + "월의 마지막날은 31일입니다.");
					break;
			
			case 4: case 6:case 9: case 11:
					System.out.println(month + "월의 마지막날은 30일입니다.");
					break;

			case 2 :
				System.out.println("year? ");	
				int year = sc.nextInt();
				
				if ((year % 400 == 0) || (year % 4 == 0) && ((year % 100 != 0))) {
					System.out.println("윤년입니다. 마지막날은 29일입니다.");
				} else {
					System.out.println(month +"월의 마지막날은 28일 입니다.");
				}
					break;
			default:
				System.out.println("잘못입력하셨습니다. 1~12 사이 숫자만 넣으세요");
				break;
			}	
	}
}
