package quiz;
//점수를 입력받고 평점 구하기
// 100~90:A
// 89~80:B

import java.util.Scanner;
public class Quiz_IF {
	/*
	public static void main(String[] args) {

		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");				
		} else {
			System.out.println("F");
		}
	}*/
	
	//3과목으로 평균내고 과락
	public static void main(String[] args) {

		System.out.println("국어, 영어, 컴퓨터 점수를 차례로 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		int total;
		double avg;

		total = kor + eng + com;
		avg =  (double) total/3;

		System.out.println("평균은" + avg + "점입니다.");

		if (avg >= 60) {

			if (kor<40 || eng < 40 || com < 40) {
				System.out.println("과락입니다.");

				if (kor <40) {
					System.out.println("국어 과락");

				}else if (eng<40) {
					System.out.println("영어 과락");

				}else if (com <40) {
					System.out.println("전산 과락");				
				}
			}else {
				System.out.println("합격입니다.");
			}
		}else {
			System.out.println("평균 점수 미달 불합격.");			
		}
	}
	/*
	//교수님 풀이
	public static void main(String[] args) {
		System.out.println("kor= "); int kor = new Scanner(System.in).nextInt();
		System.out.println("eng= "); int eng = new Scanner(System.in).nextInt();
		System.out.println("com= "); int com = new Scanner(System.in).nextInt();
		double avg = (kor + eng + com) / 3.0;
		
		if(avg >= 60) { //3과목 평균이 60점 이상
			
			if(kor >= 40 && eng >= 40 && com >= 40) {
				System.out.printf("모든 과목 40점 이상이며, 평균이 %.3f로 [합격]입니다.\n", avg);
			} else {
				System.out.printf("평균이 %.1f이지만, \n",avg);
				if (kor < 40) System.out.printf("국어 " + kor +"점");
				if (eng < 40) System.out.printf("영어 " + eng +"점");
				if (com < 40) System.out.printf("전산 " + com +"점");
				System.out.printf("으로 불합격입니다.");
			}
		
		} else {
				System.out.printf("평균이 %.1f이지만 [평균 미달 탈락]입니다.", avg);
		}	//out if end
	}
	 */
}
