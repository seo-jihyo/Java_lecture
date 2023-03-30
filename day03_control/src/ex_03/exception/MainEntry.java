/*
package ex_03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {


		System.out.println("x, y = ");
		int x, y, result;

		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		if ( y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");

			System.exit(0);
		}
		result = x / y;		//에러 발생할 수 있음.

		System.out.println(result);
	}
}
 */
/*
package ex_03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {


		System.out.println("x, y = ");
		int x, y, result;

		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		try {
			result = x / y;	//에러 발생 할 수 있다.

			System.out.println(result);

		}catch (Exception e) {
			//System.out.println("0으로 나눌 수 없습니다.");// TODO: handle exception
			//System.out.println(e.getMessage());
			e.printStackTrace();//조금 더 세밀하게 출력됨
		}
	}
}
*/

package ex_03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {


		
		int x=0, y, result;

		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();

		try {
			result = x / y;	//에러 발생 할 수 있다.

			System.out.println(result);

		}catch (Exception e) {
			//System.out.println("0으로 나눌 수 없습니다.");// TODO: handle exception
			//System.out.println(e.getMessage());
			e.printStackTrace();//조금 더 세밀하게 출력됨
		}
	}
}