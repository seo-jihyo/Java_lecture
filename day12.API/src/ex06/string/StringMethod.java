package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happyseojihyo";
		String s2 = "SEOUL";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("EO", "korea"));
		System.out.println(s2);
		s2 = s2.replace("EO", "korea");
			System.out.println(s2);
			System.out.println("===========================");
//			s1 = s1 + s2;
//			System.out.println(s1);
			s1 = s1.concat(s2);  // 문자열 결합
			System.out.println(s1);
			System.out.println("===========================");
			
			String s3 = new String("	ab		cd		");
			System.out.println(s3);
			System.out.println(s3.length()); //문자열 길이
			s3 = s3.trim(); //문자열 공백 제거
			System.out.println(s3);
			System.out.println(s3.length());
			System.out.println("============================");
			
			String s4 = new String("ab defgh 23432 akoek 67876");
			String[] s5 = s4.split(" ");  //공백이 구분자 역할
			for (int i = 0; i < s5.length; i++) {
				System.out.println("분리된 " +i+"번 문자열:" + s5[i]);
			}
			System.out.println("============================");
			String s44 = new String("ab/defgh/23432/akoek/67876");
			String[] s55 = s44.split("/");  //공백이 구분자 역할
			for (int ii = 0; ii < s55.length; ii++) {
				System.out.println("분리된 " +ii+"번 문자열2:" + s55[ii]);
			}
			
			System.out.println("============================");
			String s6 = "123-456-789";
			String[] s7 = s6.split("-");
			for (int i = 0; i < s7.length; i++) {
				System.out.println(s7[i]);
			}
			System.out.println("============================");
			String s8 = "1231213546asd 45654asdfa 654 string";
			char ch = s8.charAt(10);  //10번째 문자 뽑기
			System.out.println(ch);
	
			s8 = s8.substring(5,7); //5 포함 7 미포함
			System.out.println(s8);
	
			System.out.println("====================================================");
			System.out.println("소문자로 출력 toLowerCase(): " + s2.toLowerCase());
			System.out.println("대문자로 출력 toUpperCase(): " + s1.toUpperCase());
			System.out.println(s2);
			
			
			char[] ch2 = s1.toCharArray();
			for (int i = 0; i < ch2.length; i++) { 
				System.out.print(ch2[i]+"\t");

			}
	}
}
