/*package ex_02.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s,d,b,j) = ");
		Scanner sc = new Scanner(System.in);
		
		String str = "korea";
		char ch = str.charAt(3);
		System.out.println(ch);
//		char ch = sc.next().charAt(0);		//문자 입력받기
//		String ch = sc.next();	//문자열 입력받기
//		char op = ch.charAt(0); //문자열 함수 중에 문자열에서 charAt(index)인덱스번호 문자 가져ㅗㅇ는 함수
		

		switch ( ch ) {
		case "s": System.out.print("서울"); break;
		case "d": System.out.print("대구"); break;
		case "b": System.out.print("부산"); break;
		case "j": System.out.print("제주"); break;
		
		default:
			System.out.println("잘못 눌렀습니다. s, d, b, j 중에 하나만 선택하세요");
			System.exit(0); //프로그램 강제 종류
		} //switch end
		System.out.println("를(을) 선택하셨습니다.");
	}
}*/

//*
package ex_02.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s,d,b,j) = ");
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();	//문자열 입력받기
		
		switch ( ch ) {
		case "s": System.out.print("서울"); break;
		case "d": System.out.print("대구"); break;
		case "b": System.out.print("부산"); break;
		case "j": System.out.print("제주"); break;
					
		default:
			System.out.println("잘못 눌렀습니다. s, d, b, j 중에 하나만 선택하세요");
			System.exit(0); //프로그램 강제 종류
		} //switch end
		System.out.println("를(을) 선택하셨습니다.");
	
}
}
/*//

/*package ex_02.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("point = ? (1,2,3) ");
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {	//long형 제외한 정수형, 문자형 올 수 있다.
		case 1: 		//값 : 숫자, '문자', "문자열"
			System.out.println("포인트 점수 1점입니다.");
			break;
		
		case 2: 		
			System.out.println("포인트 점수 2점입니다.");
			break;
		
		case 3: 		
			System.out.println("포인트 점수 3점입니다.");
			break;
			
		default:		//생략 가능 - 에러 처리 메시지
			System.out.println("잘못된 숫자. 1, 2, 3 중에서 선택하세요.");
		} //switch end
			System.out.println("main end!!");
	}
}
*/