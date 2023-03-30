package quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		
		
		String name;
		int kor, eng, com, total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요.");
		name = sc.next();
		
		System.out.println("국어 성적을 입력해 주세요.");
		kor = sc.nextInt();
		System.out.println("영어 성적을 입력해 주세요.");
		eng = sc.nextInt();
		System.out.println("전산 성적을 입력해 주세요.");
		com = sc.nextInt();
		
		total = kor + eng + com;
		avg = total / 3;

		System.out.println(name + "님의 성적표");
		System.out.println("=====================");
		System.out.printf("국어 : " + kor + 
						  ", 영어 : " + eng +
						  ", 전산 : " + com +
						  ", 평균 : " + avg);
	}
}