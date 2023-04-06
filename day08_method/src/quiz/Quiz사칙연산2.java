package quiz;

import java.util.Scanner;

public class Quiz사칙연산2 {
	
	
	private static void mul(int su1, int su2) {
		System.out.println(su1 +"*" +su2+"="+(su1*su2));
	}
	
	private static void plus(int su1, int su2) {
		int result = su1 + su2;
		System.out.println(su1 +"+" +su2+"="+(su1+su2));
	}
	private static void sub(int su1, int su2) {
		int result = su1 - su2;
		System.out.println(su1 +"-" +su2+"="+(su1-su2));
	}
	public static double div(double x, double y) {
		
		if (y == 0 ) {
			System.out.println("0으로 나눌 수 없다.");
			System.exit(0);
		}
		return x/y;
		
	}
	public static void main(String[] args) {
		//함수 호출 - 
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("input data = ");
			int su1 = sc.nextInt();
			int su2 = sc.nextInt();
			
			System.out.println("integer data input(1:+ ,2:/ ,3:* ,0) = 	");
			int choice = sc.nextInt();
			
			
			
			switch (choice) {
			case 1: plus(su1, su2); break;
			case 2: div(su1, su2); break;
			case 3: mul(su1, su2); break;
			case 0: System.out.println("종료하겠습니다~");
					System.exit(0);
			default:
					System.out.println("없는 번호를 선택하셨습니다.");
			}//end of switch
		}// end of while
	}
	
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.println("input data = ");
//			int su1 = sc.nextInt();
//			int su2 = sc.nextInt();
//			
//			plus(su1,su2);
//			mul(su1,su2);
//			
//			double num = div(su1,su2);
//			System.out.println(num);
//			System.out.println(num);
//			System.out.println(num);

//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
}
