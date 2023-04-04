package ex04.array;

import java.util.Scanner;

/*
public class MainEntry {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1); 
		  //arr[i] = (i+1)*5 5씩 건너뜀
		  //arr[i] = (int)(Math.random()*100)+2); 0,1은 출력 안함
			
		}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+"\t");
		
		if ( (i+1)  % 10 == 0 )System.out.println();
			
		
		
	}
	}
	
}
*/
public class MainEntry {
	public static void main(String[] args) {
		int[] a = new int[30];
		int[][] a2 = new int[2][3];	//초기화되어 있지 않을 경우에는 행,열 크기 생략 안됨
		int[][] a3 = new int[][] {{1,2,3},{4,5,6}};
		int[][] a4 = {{1,2,3},{4,5,6}};
//		int[][] a5 = {1,2,3,4,5,6};  //에러
//		int[][] a6 = new int[2][]{1,2,3,4,5,6};  //행 크기 잡아놔도 에러
		int[][] a7 = {{0,},{0,}}; //0으로 초기화, 컴마 생략 가능
		
		//3차원
		int[][][] a8 = new int[2][2][3]; //[면][행][열]
		
		//배열 크기(길이)
		System.out.println("1차원 배열 길이 : " + a.length);
		System.out.println("2차원 배열 행 길이 : " + a2.length);
		System.out.println("2차원 배열 열 길이 : " + a2[0].length);
		System.out.println();
		System.out.println("3차원 배열 면 길이 : " + a8.length);
		System.out.println("3차원 배열 행 길이 : " + a8[0].length);
		System.out.println("3차원 배열 열 길이 : " + a8[0][0].length);
		
		//임의적인 데이터 입력 받아서 배열 데이터값 출력하는 프로그램 작성
		//input
		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 입력할 숫자 : ");
		for (int i = 0; i < a8.length; i++) { //면
			for (int j = 0; j < a8[0].length; j++) { //행
				for (int k = 0; k < a8[0][0].length; k++) { //열
			a8[i][j][k] = sc.nextInt();
			//a8[i][j][k] = (int)(Math.random()*100)
			//a8[i][j][k] = ++x;
			//a8[i][j][k] = x += 10;
			//a8[i][j][k] = new Random.nextInt(45)+1;
			
		}
	}
}
		//output
		for (int i = 0; i < a8.length; i++) {
			for (int j = 0; j < a8[0].length; j++) {
				for (int k = 0; k < a8[0][0].length; k++) {
				
					System.out.print(a8[i][j][k]);
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
