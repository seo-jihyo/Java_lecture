package ex01.method;

public class MethodEx2 {
	public static String name(int x, String irum) {
		System.out.println("x = " + x);
		return irum; //return type보다 함수의 type이 우선순위가 더 높다.
	}
	public static String display(int x, String name) {
		for (int i = 0; i <= x; i++) {
			System.out.print(name + "\t");
		}
		return name; 
	}
	
	public static void main(String[] args) {
		
		System.out.println(display(10,"&"));
		String star = display(20, "*");
		System.out.println(star);
		
		System.out.println("==================================");
		String str = name(10,"jihyo");	//1방법
		System.out.println(str);
		
		System.out.println("name() call : " + name(99, "seo")); //2 방법
	}
}
