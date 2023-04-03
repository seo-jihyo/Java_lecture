package quiz;

import java.util.Scanner;

//7명의 성저처리 배열 이용
public class QuizEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[7][3];

		
		for (int i = 0; i < score.length; i++) {
			System.out.println("점수를 입력하세요." + (i + 1) + "번째 학생");

			for (int j = 0; j < score[0].length; j++) {
				score[i][j] = sc.nextInt();

			}
		}

		System.out.println("  번호\t국어\t영어\t전산\t총점\t평균");
		System.out.println("=====================================================");

		for (int i = 0; i < score.length; i++) { // 행의 개수
			int sum = 0;

			System.out.print("   " + (i + 1) + "    ");

			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j]; // j= 0,1,2
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("%d \t %.2f \n", sum,(double)sum/score[i].length);
		}
	}
}