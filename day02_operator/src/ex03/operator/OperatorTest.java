package ex03.operator;

public class OperatorTest {
	public static void main(String[] args) {
		//대입연산자: =, +=, -=, *=, /=, <<=, >>=,...
		
		int x = 2, y = 3, result;
	
		result  = x + y;
		System.out.println(result);
		
		x = x + y;
	//	x =+ y; // =+ <--window에서 X +=만 가능
		x = x * y;
		
		System.out.println(x);
		
//		x = x * y; //처리되는 속도가 두 배 이상 빠름
		x *= y;
		System.out.println(x);
		
	}
}
