package ex04.apiObject;

class Circle {
	int x, y;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		if(c1 == c2) System.out.println("같다.");
		else System.out.println("다르다");
										// -> 다름
		
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
		if(x == y) System.out.println("same");
		//t스택 영역에 있는 데이터
		else System.out.println("not same");
		
		System.out.println("참조형 자료형 비교");
		String str1 = new String("kosa");
		String str2 = new String("kosa");
		
		if (str1 == str2) System.out.println("same");
		else System.out.println("not same");
		
		System.out.println("----------------------------");
		System.out.println("***equals() method 비교***********");
		if (str1.equalsIgnoreCase(str2)) System.out.println("same222");
			else System.out.println("not same222");
	}
}
