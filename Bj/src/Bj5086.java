import java.util.Scanner;

public class Bj5086 {
	public static void main(String[] args) {

		// 입력받기
		Scanner sc = new Scanner(System.in);

		while (true) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			// a,b 가 나머지가 0이면 공배수 break;
			if (a == 0 && b == 0)
				break;

			if (b % a == 0) {
				System.out.println("factor");

			} else if (a % b == 0) {
				System.out.println("multiple");

			} else {
				System.out.println("neither");
			}
		}
	}
}