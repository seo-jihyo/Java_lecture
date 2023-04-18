package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderQuiz01{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("두개의 정수와 연산자를 입력");
		int su1 = Integer.parseInt(br.readLine());
		int su2 = Integer.parseInt(br.readLine());
		double result = 0;
		
		String op = br.readLine();
		switch (op) {
		case "+":
			result = su1 + su2;
			break;
		case "-":
			result = su1 - su2;
			break;
		case "*":
			result = su1 * su2;
			break;
		case "/":
			result = su1 / su2;
			break;
		}
	System.out.printf("%d %s %d = %.2f",su1, op, su2, result);
	}
}
