package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderQuiz {
	
	private static void mul (int x, int y) {
		System.out.println(x + "*" + y + "=" + (x*y));
	}
	private static void plus(int x, int y) {
		int result = x + y;
		System.out.println(x + "+" + y + "=" + (x+y));
	}
	private static void sub(int x, int y) {
		int result = x - y;
		System.out.println(x + "-" + y + "=" + (x-y));
	}
	public static void div(double x, double y) {
		double result = x/y;
		System.out.println(x + "/" + y + "=" + (x/y));
		if (y == 0) {
			System.out.println("0으로 나눌 수 없다.");
			System.exit(0);
		}
//		return x/y;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		while (true) {	
			System.out.println("input x: ");
			int x = Integer.parseInt(br.readLine());
			System.out.println("input y: ");
			int y = Integer.parseInt(br.readLine());
			System.out.println("integer data input(1:+ ,2:/ ,3:* ,0) = 	");
			int choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
			case 1: plus(x, y); break;
			case 2: div(x, y); break;
			case 3: mul(x, y); break;
			case 0: System.out.println("종료하겠습니다");
					System.exit(0);
			default:
					System.out.println("없는 번호를 선택하셨습니다.");
			}//end of switch
		}// end of while
	
	}
}
