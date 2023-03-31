package homework;

// + - 반복 -1 + 2 -3 +4 -5 ...+10=5
public class Hw2_0331 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				sum += i;

			} else {
				sum -= i;
			}
		}
		System.out.println("Sum = " + sum);
	}
}
