package quiz;

import java.util.Scanner;

//문제] 기상청, 단 특정월 4월 (30일 기준), 비가 온 날에 대한 강수량 
//평균(double소수점 두자리) 구하는 프로그램
public class QuizEx2 {
	public static void main(String[] args) {

		System.out.print("Day: "); //날짜 입력
		int n = new Scanner(System.in).nextInt();
		int[] day = new int[n];  //30일 입력받으면 n=30
		int sum = 0;
		
		for (int i = 0; i <= n; i++) { // 30만큼 돌리면서 랜덤으로 비온 날 뽑아내고
			day[i] = (int) (Math.random()*1.5); // 뽑힌 날짜 = 비가 온날 -> *1.5해줌
			sum += day[i]; //그리고 카운트
		}
		System.out.printf("평균: + %.2f", (double)sum/n); 
	}
}
