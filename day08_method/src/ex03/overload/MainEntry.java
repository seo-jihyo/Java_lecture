package ex03.overload;

public class MainEntry {
	
	public static void line() {
		System.out.println("-------------------------------------");
	}
	public static void line(String str) { //배열: length라는 필드가 있음 (배열의 길이를 구해줌)
										  //문자열: length()라는 함수가 있음. (문자열의 길이)
		System.out.println("str");
		}
	public static void line(int n, int y, String str) {
		
		if(n> y) {
			int temp = n;
			n = y;
			y = temp;
		}
		for (int i = 1; i < n; i++) {
			System.out.print(str+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		line(10,"$");
		line("*");
		line("&&&");
//		line(20,"A");
		
		
		
		
		line("*");
		line();
		plus(20);
		plus(12.34);
		plus("Hello"); //ctrl키와 함꼐 클릭하면 알아서 찾아줌
	}
	public static void plus(int x) {
		System.out.println(x + 100);
	}
	public static void plus(int x,int y) { //함수명은 같아도 매개변수의 개수가 다르거나
		System.out.println(x + y);
	}
	public static void plus(double x) { 	//자료형이 다르면 된다.
		System.out.println(x);
	}
	public static void plus(String x) { 	//자료형이 다르면 된다.
		System.out.println(x);
	}

	
}
