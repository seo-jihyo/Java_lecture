package Ex03.IO;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in;  //표준 입력
		try {
			System.out.println("단일 문자 입력 : ");
			int num = is.read(); //예외 발생, '0'~'9' ascii:48~57
//			System.out.println((char)num);
			is.read(); is.read(); 	  //return 받는 타입이 int형임
			int num2 = is.read()-48;  //입력받은 문자 그대로 출력
			
			System.out.println(num);
			System.out.println(num2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
