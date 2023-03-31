package quiz;

public class DoWhileGuGuDan {
	public static void main(String[] args) {

		int a = 1;

		while (a <= 9) {

			int b = 1;

			while (b <= 9) {

				System.out.printf("%d * %d = %d\t", b, a, a + b);
				b++;
			}
			a++;
			System.out.println();
		}
	}

}