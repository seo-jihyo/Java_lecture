package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz_ExceptionTryMultiCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 두 개를 입력해 주세요.");
			System.out.println("x= ");
			int x = sc.nextInt();
			System.out.println("y= ");
			int y = sc.nextInt();
			System.out.println("x/y= " + (x/y));
		
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기는 불가능합니다.");
			System.out.println("프로그램을 종료합니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (InputMismatchException e) {
			System.out.println("숫자를 입력해 주세요.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		
		}
	}
}
