package ex_04.For;

public class QuizEx1 {


/*
//문제] 1 ~ 100까지 합을 구하기
	public static void main(String[] args) {

		int sum = 0; // 변수 초기화하고 시작하기

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");

		sum = 0; // 누적할 변수는 반드시 초기화한다.
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
	}
}
//*/
	//문제2. 1부터 100까지 3의 배수의 합과 개수를 구하는 프로그램 작성
	public static void main(String[] args) {
/*		
		int sum = 0;
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("1부터 100 중 3의 배수의 합: " + sum + 
							"\n3의 배수의 개수: " + count);
	}
	*/
		
		int sum = 0;
		int cnt = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 7 == 0) {
				sum += i;
				cnt++;
				
			}
		}
	System.out.println("합: " + sum + "\n개수: " + cnt);
	}
}

