package ex_05.While;
public class MainEntry {
	public static void main(String[] args) {

		int a = 1, b = 1;
		do {
			b = 1; //다중 while, do-while문에서는 안쪽에 있는 변수의 초기화가 필요하다.
			do {
				System.out.println(b + "\t");
				b++;
			} while (b <= 3);	//조건
			
			//b = 1;
			a++;		//증감식
			System.out.println();
	
		} while(a<=2);	//조건, 문장 종결 기호

}
	/*
	
		
		int i = 0;
	
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
	}
	*/
}
