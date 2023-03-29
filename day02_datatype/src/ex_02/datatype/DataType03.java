package ex_02.datatype;

public class DataType03 {
	//진법
	public static void main(String[] args) {
		int su = 10;
		
		System.out.println("10진수: " + su); 
		//%d (10진수출력), %o(8진수), %x(소문자 abc)
		System.out.printf("10진수: %d\n", su); 
		System.out.printf("8진수: %o\n", su); 
		System.out.printf("16진수: %x %X \n", su, su); 
		System.out.println("======================");
		
		//0숫자 -> 8진수, 0x숫자 -> 16진수
		System.out.printf("%d\n", 012); 	//012(8진수-> 10진수)
		System.out.printf("%d\n", 0xa); 	//0xa(16진수-> 10진수)
		System.out.println("======================");
		
		double f = 12.34;
		System.out.println(f);
		
		float ff = 5.6f;
		System.out.println(ff); //접미사 붙여줌

		
	}
}
