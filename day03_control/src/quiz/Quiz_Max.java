package quiz;

import java.util.Scanner;

//문제3. 정수 2개 입력받아서 큰 수 출력하는 프로그램 작성
public class Quiz_Max {
	public static void main(String[] args) {
		System.out.println("두 개의 수를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(); 
		int y = sc.nextInt();
	
   /*
		if (x < y) {
			System.out.println("더 큰 수는 " + y + "입니다.");
		}else 
			System.out.println("더 큰 수는 " + x + "입니다.");
		
	*/
		
		int max = (x > y) ? x : y;
		System.out.println("더 큰 수는 " + max +"입니다.");
	}
}



