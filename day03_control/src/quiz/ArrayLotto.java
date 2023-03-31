package quiz;

public class ArrayLotto {
public static void main(String[] args) {
		
		int[] ball = new int[45];      //로또 공 45개를 선언하는 과정
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;     //45개의 배열 선언을 하면 0~44까지 배열이 생성, 그래서 i+1을 해줌
		
		}
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i < 300; i++) {
			j = (int) (Math.random() * 45);     //난수 출력 후
		
		temp = ball[0];
		ball[0] = ball[j];
		ball[j] = temp;                         //섞는다
		
	}
		System.out.println();
		System.out.println("로또 당첨 번호 \n");

		
		for(int i = 0; i < 6; i++) {     // 앞에서부터 6개의 공을 뽑아내는 과정
			
			System.out.print(ball[i] + "\t");
			
		}
		
		System.out.println();
		System.out.print("\n보너스 당첨 번호는 ");
		System.out.print( + ball[6] + " 번입니다.\t");
	}
}
