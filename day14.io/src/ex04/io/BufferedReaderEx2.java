package ex04.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("input1: ");
		String str1 = br.readLine();
		int su1 = Integer.parseInt(str1);
		System.out.println("input2: ");
		String str2 = br.readLine();
		int su2 = Integer.parseInt(str2);
		
		
		//-----------------------------------------------
		
		System.out.println("input3: ");
		
		int su3 = Integer.parseInt(br.readLine());
		int su4 = Integer.parseInt(br.readLine());
		
		System.out.println(su1+su2);
		System.out.println(su3+su4);
//		System.out.println(str1+str2);
		
	}
}
