package Ex02_array;

public class MainEntry {
	public static void main(String[] args) {
		
		//1.
		char[] ch;	//배열 선언 (아직 사용 x0
		ch = new char[4]; //배열 생성, 메모리에 할당 (이제 사용할 수 있다)
		
		//2.
		char[] ch2 = new char[4]; //배열 선언과 동시에 생성, 메모리 할당
		
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//3.선언과 동시에 초기화
		char[] ch3 = {'J', 'A', 'V', 'A','k'}; //배열의 크기는 5
		
		//배열의 크기(길이)
		System.out.println("배열의 크기(길이): " + ch2.length);
		
		//배열의 내용 출력
		System.out.println("ch2= " + ch[2]);
		System.out.println("=====================");
		for(int i = 0; i < 4; i++) {
			System.out.println("ch2[" + i +"]= "+ch2[i]);
		}
		//전체 출력
		System.out.println("=====================");
		for (int i = 0; i <ch3.length; i++) { //배열의 길이를 구하는 필드 length 이용
				System.out.println("ch[" + i +"]= "+ch3[i]);
			}
			
		
		
		
	}
}
