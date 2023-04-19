package ex06.filecopy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
	public static void main(String[] args) throws IOException{
		
		URL url = new URL("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
		
		//읽기 객체
		InputStream is = url.openStream(); // 예외 빌생
		//쓰기 객체
		OutputStream os = new FileOutputStream("google.jpg");  

	byte[] buffer = new byte[1024 * 8];  //
		
		while(true) {
			int inputData = is.read(buffer); //buffer 크기 만큼 읽어들임
			if(inputData == -1 ) break;
			os.write(buffer, 0, inputData);
		}
		os.close(); is.close();
		System.out.println("웹에서 파일 복사 성공했습니다.");
	}
}
