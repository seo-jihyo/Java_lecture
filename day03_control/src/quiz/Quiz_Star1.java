package quiz;

import java.util.Scanner;

public class Quiz_Star1 {
	public static void main(String[] args) {
		
		
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

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println(" ".repeat(i)+"*".repeat(N-1));
			
		}
		
		}

	}
