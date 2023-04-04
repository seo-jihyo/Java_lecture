package quiz;

import java.util.Scanner;

public class QuizEx3_1 {
	public static void main(String[] args) {
		
		int[][] a = new int[3][4];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("array data 2row 3col = ");
		//input
		
		for(int i=0; i<a[0].length;i++) { 
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("a["+i+"]["+j+"]=");
				a[i][j] = sc.nextInt();
				
			}// j end
		}//i end
		for (int i = 0; i < a[0].length; i++) {
			a[2][i] = a[1][i] +a[0][i];
		}//for end
	

		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a[i].length; j++) {
			System.out.println(a[i][j]+"\t");
				
			}//j end
			System.out.println();
			
		}//i end
			
	}
}
