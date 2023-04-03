package quiz;

import java.util.Arrays;

public class QuizEx4 {
	public static void main(String[] args) {

			int[][] a =  { {1,2,0},{5,7,0} }; //초기화
			System.out.println("___________________________");
			System.out.println("배열의 행 크기: " + a.length); 
			System.out.println("열의 크기: " + a[0].length); 	
			
			for (int i = 0; i < a.length; i++) { 
				a [i][2] = a[i][0] * a[i][1];
			}
				for (int i = 0; i < 2; i++) { 
					
					System.out.print(Arrays.toString(a[i]));
			
				} //j end
			
			} //i end
}
