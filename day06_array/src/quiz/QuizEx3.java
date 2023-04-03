package quiz;

import java.util.Arrays;

public class QuizEx3 {
	public static void main(String[] args) {
		
		int[][] a =  { {3,8,5,10},{7,1,2,3},{0,0,0,0} }; //초기화
		System.out.println("___________________________");
		System.out.println("배열의 행 크기: " + a.length); //2
		System.out.println("열의 크기: " + a[0].length); 	//3
		
		
		for (int i = 0; i < a.length; i++) { //행크기
			a [2][i] = a[0][i]+a[1][i];
		}
			for (int i = 0; i < 3; i++) { //열크기
				
				System.out.print(Arrays.toString(a[i]));
		
			} //j end
		
		} //i end
	
	
	
}
