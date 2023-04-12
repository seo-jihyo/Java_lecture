package ex06.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "Hello";
		System.out.println("str : " + str); //1
		
		char data[] = {'a','b','c'};
		str = new String(data);
		System.out.println("str : " + str); //2
		System.out.println("kbs"); //3
		
		String msg = "cdefghi ";
		System.out.println("Korea " + msg); //Korea cdefghi 
		
		msg = msg.concat(" Korea");  //문자열 결합
		System.out.println(msg); //cdefghi Korea
		
		String str2 = "abcdef".substring(2);
		System.out.println(str2);  //2번 글자부터 출력됨
		
		String str3 = "HelloWorld".substring(2, 5);  // 상한값 포함, 하한값 포함 X (2, 3, 4만 나옴)
		System.out.println(str3);
		
		System.out.println(msg+ " :  + str2");
	}
}
