package quiz;

import java.util.Scanner;

public class Quiz_1 {
	public static void main(String[] args) {
		
		   System.out.println("문자를 입력하세요.");
		      
		      Scanner sc = new Scanner(System.in);
		      String a = sc.next();
		      char c = ' ';
		      c = a.charAt(0);
		      
		      if(( c >= 'A') && (c <= 'Z')) {
		         System.out.printf("%c" , (c + 32));
		      }else if ((c >= 'a') && ( c <= 'z')) {
		         System.out.printf("%c" , (c - 32));
		      }
	}
}
