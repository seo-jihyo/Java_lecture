package ex02.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException, IOException{
		URL url = new URL("https://www.google.com");//
		
//		System.in : 표준 입력 - 키보드로부터~
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
															//IOException 발생
		String inputLine;
		while ( (inputLine = br.readLine()) != null ) { //IOException 발생
			System.out.println(inputLine);
		}
		br.close();
	}
}
