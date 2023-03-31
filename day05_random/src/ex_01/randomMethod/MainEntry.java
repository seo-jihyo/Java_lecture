package ex_01.randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(Math.random());
//		Math.random()*n  -~n-1값 출력됨
		System.out.println(Math.random()*5);	//0~4
		
		System.out.println((int)(Math.random()*5) + 1); //1~4
		System.out.println((int)(Math.random()*100) + 1); //1~100
	}
}
