import java.util.Arrays;
import java.util.Scanner;
public class Bj10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int M = sc.nextInt();
        for(int i=0; i<M; i++) {
            int a = sc.nextInt(); // a번 바구니부터
            int b = sc.nextInt(); // b번 바구니까지
            int ball = sc.nextInt(); // ball번 공을 넣는다

            for(int j = a-1; j<b; j++)
            {
                arr[j] = ball;
            }
        }

        for (int basket : arr)
            System.out.print(basket + " ");
    }
}