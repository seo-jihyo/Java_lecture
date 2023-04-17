package quiz3;

import java.util.HashMap;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		HashMap<String, Person> person = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		Person ps = null;
		int choice = 0;
		
		while (true) {
			System.out.println("1.정보 입력\n2.정보 수정\n3.정보 삭제\n4.리스트 보기\n0.프로그램 종료");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				ps = new Person();
				
				break;

			default:
				break;
			}
		}
	}
}
