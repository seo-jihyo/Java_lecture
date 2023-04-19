package ex05.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		
		try {
			//OutputStream os = new FileOutputStream("test.txt"); //상대경로
			//OutputStream os = new FileOutputStream("C:\\app\\doyeon.txt"); //절대경로
			os = new FileOutputStream("C:/app/yuna.txt");
			
			while( true ) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine() + "\r\n";
				
				//if( str.toUpperCase().equals("EXIT\r\n") ) break;
				if( str.equalsIgnoreCase("EXIT\r\n") ) {
					System.out.println(str.length() + "byte만큼 썼습니다.");
					break;
				}
				
				os.write(str.getBytes()); //예외발생. 읽어들인 문자 str의 길이(getBbytes()) 만큼 써주세요. 
				System.out.println(str); //화면출력
				
			} //while end
			
		} catch (FileNotFoundException e) {  //
			e.printStackTrace();
		} catch (IOException e) {  //
			e.printStackTrace();
		} finally {
			try { os.close(); }catch(Exception e) { e.printStackTrace(); }
		}
	}
}






