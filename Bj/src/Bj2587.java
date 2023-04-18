
import java.util.Arrays;
import java.util.Scanner;

public class Bj2587  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int mid = 0; // 중앙값
		int sum = 0; // 합
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		int avg = sum / 5;
		mid = arr[2];
		System.out.println(avg);
		System.out.println(mid);
		sc.close();
	}
}
