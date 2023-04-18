import java.util.Scanner;

public class Bj2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// 1행부터 N행까지 출력 (제일 큰 틀)
		for (int i = 1; i <= num; i++) {

			// N행에 N-i의 공백 (3행에 5-3의 공백/ 4행에 5-4의 공백...)
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
				
		//	for(int j = num - 1; j>= i ; j--;)
		//		System.out.println(" ");
			
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}		
			System.out.println();
		}
	}
}
