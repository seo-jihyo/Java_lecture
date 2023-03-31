package ex_04.For;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
/*		
//		int a = 1, b = 1;
		
//		for( ; a < 4;);{	//초기값과 증감식은 생략이 가능하다.
//			System.out.println(a);
//			a++;
//		}
//		
//		for ( ; ; ) { //무한루프 
//			System.out.println(a);
//			a++;
//			
//			//
//			if ( a == 7) break;
//		}
		for (a=1, b=5; a < 11  ; a++, b+=2) { //초기값, 증감식 2개 이상 사용 가능 ( 단 조건은 단 1개)
			System.out.println(a);
			
			
		
		}
	}
	*/
		/*
		//문제 1 - 100  짝수 출력 한줄에 10개씩 출력하기
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				System.out.print(i+ " "); //한줄로 나옴
				
				// 10개씩 출력하려면? 10개씩 끊고 개행
				if (i % 20 == 0) {
					System.out.println();
				}
			}
		}
		*/
		
		//구구단 출력
		/*
		System.out.println("단을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
	
		for (int i = 1; i <10; i++) {
		System.out.println(a + "*"+i+"=" + (a*i));
			
		}	
	}
}
		 */
		
		///////////////////////////별찍기
		
		/*
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
		*/
	/*

	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        String star = "*";
	        for(int i=1; i <= N; i++){
	            System.out.println(star.repeat(i));
	        }
	    */
/*
	       Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();

	        for(int i = 0; i < N; i++){
	            System.out.println(" ".repeat(i)+"*".repeat(N-i));
	        
	        }
		*/
		/*
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= i; j--) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		*/
		
		
	}
}
