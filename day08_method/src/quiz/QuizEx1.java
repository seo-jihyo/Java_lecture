package quiz;
//add(int, int), sub(1,2,3), message(){인사말 출력}

public class QuizEx1 {
	public static void main(String[] args) {
		message();
		add(3, 2);
		sub(1, 2, 3);
		max(10, -55);
	}

	public static void add(int x , int y) {
		System.out.println(x+y);
	}
	public static void sub(int x, int y, int z) {
		int sub = x+y+z;
		System.out.println("sum= " + sub);
	}
	public static void message() {
		System.out.println("안녕하세요");
	}
	private static void max(int i, int j) {
		int max = i+j;
		if (max < 0) {
			System.out.println();
		}
		System.out.println("max=" + max);
	}
	
}