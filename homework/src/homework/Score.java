package homework;

import java.util.Arrays;
import java.util.Scanner;

//성적 처리 프로그램-함수
//입력, 출력, 총점, 학점,매인함수
public class Score {

	private static void line() {
		System.out.println("-------------------------------------");
	}

	public static void main(String[] args) {
		int SU = 4, NO = 3;
		int[][] score = new int[SU][NO + 1]; // 인원수, 과목수
		String[] name = new String[SU];
		double[] avg = new double[SU];
		char[] grade = new char[SU];

		input(name, score);
		sum(score);
		avgc(score, avg, NO);
		
		for (int i = 0; i < avg.length; i++) {
			grade[i] = level(avg[i]);
		}
		double[] rank = Arrays.copyOf(avg, SU); // 배열 copy
		Arrays.sort(rank); // 정렬
	
		output(name, SU, score, avg, grade, rank);
	}

	public static void input(String[] name, int[][] score) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d 번째 학생 이름: ", i + 1);
			name[i] = sc.next();
			for (int j = 0; j < score[0].length - 1; j++) {
				switch (j) {
				case 0:
					System.out.println("국어점수 입력: ");
					break;
				case 1:
					System.out.println("영어점수 입력: ");
					break;
				case 2:
					System.out.println("전산점수 입력: ");
					break;
				} // switch end
				score[i][j] = sc.nextInt();
			}
		}
	}
	
	private static void sum(int[][] score) { // 총점
		// TODO Auto-generated method stub
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length - 1; j++) {
				score[i][3] += score[i][j];
			}
		}
	}
	
	private static void avgc(int[][] score, double[] avg, int NO) { // 평균
		// TODO Auto-generated method stub
		for (int i = 0; i < score.length; i++) {
			avg[i] = score[i][3] / NO;
		}
	}

	private static char level(double avg) { // 학점
		// TODO Auto-generated method stub
		char grade = ' ';
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		} // switch end

		return grade;
	}


	public static void output( String[] name, int SU, int[][] score, double[] avg, char[] grade, double[] rank) {

		for (int i = 0; i < score.length; i++) {
			System.out.println(name[i] + "님의 성적표");
			System.out.println("국어: " + score[i][0] + ", 영어: " + score[i][1] + ", 전산: " + score[i][2]);
			System.out.printf("총점: %d, 평균 : %.1f, 학점 : %c,", score[i][3], avg[i], grade[i], rank[i]);

			for (int j = 0; j < rank.length; j++) {
				if (rank[j] == avg[i]) {
					System.out.printf("석차: %d\n", SU - j);
				}
			}
			line();
		}
	}
}