package homework;

import java.util.Arrays;
import java.util.Scanner;
//2차원 배열
public class Array2Score {
	public static void main(String[] args) {
		
		int SU = 4, NO = 3;
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[SU][NO+1];	//인원수, 과목수
		String[] name = new String[SU];
		double[] avg = new double[SU];
		char[] grade = new char[SU];
	
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d 번째 학생 이름: ", i+1);
			name[i] = sc.next();
			
			for (int j = 0; j < score[0].length-1; j++) {
				switch(j) {
				case 0 : System.out.println("국어점수 입력: ");
					break;
				case 1 : System.out.println("영어점수 입력: ");
					break;
				case 2 : System.out.println("전산점수 입력: ");
					break;
				}	//switch end
				
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j]; //총점
				
				
				
				//학점(평점)
				switch( (int)avg[i]  / 10) {
				case 10:
				case 9: grade[i] = 'A'; break;
				case 8: grade[i] = 'B'; break;
				case 7: grade[i] = 'C'; break;
				case 6: grade[i] = 'D'; break;
				default : grade[i] = 'F';
				} //switch end
			} //j
		} //i
				
		
		
		//out put
		double[] rank = Arrays.copyOf(avg, SU); //배열 copy
		Arrays.sort(rank); //정렬
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(name[i]+"님의 성적표");
			System.out.println("국어: " + score[i][0]+ ", 영어: " + score[i][1]+ ", 전산: " + score[i][2]);
			
					System.out.printf("총점: %d, 평균 : %.1f, 학점 : %c,", score[i][3], avg[i], grade[i], rank[i]);
				for (int j = 0; j < rank.length; j++) {
					if (rank[j]==avg[i]) {
						System.out.printf("석차: %d\n",SU-j);
					}
				}
				
			line();
		}
	}
	private static void line() {
		System.out.println("--------------------------------");
	}
}