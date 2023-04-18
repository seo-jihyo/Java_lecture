import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bj10815 {
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //숫자 카드의 개수
		Map<Integer, Integer> card = new HashMap<>();
		for (int i = 0; i < N; i++) {
			card.put(sc.nextInt(), 1); // 5개 추가
		}
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			
			if (card.get(sc.nextInt()) != null) { //값 뽑아서 비교
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}

		}
	}
}
