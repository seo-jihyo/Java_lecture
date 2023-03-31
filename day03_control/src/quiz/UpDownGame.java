package quiz;

import java.util.Random;
import java.util.Scanner;

//1부터 100까지 숫자 중에서 난수 출력 dan = 난수,
//사용자가 입력한 것과 비교해서 5번
public class UpDownGame {
	public static void main(String[] args) {

		Random rand = new Random(); //랜덤 숫자 출력
		// System.out.println(rand.nextInt(100)+1);
		int ans = rand.nextInt(100) + 1; //답 ans에 저장한다.


		for (int i = 1; i < 6; i++) { // 5번의 기회를 줌
			
			System.out.println("랜덤 숫자를 입력하세요");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();		// 입력받는 것 5번

			if (x != ans) {	//답이 아닐 때
				if (x < ans) {
					System.out.println("up");
				} else if (x > ans) {
					System.out.println("down");
				}
			} else
				System.out.println("정답입니다.");
		}
		System.out.println("정답은 "+ ans +"입니다.");
	}
}