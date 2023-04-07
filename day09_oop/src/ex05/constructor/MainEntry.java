package ex05.constructor;

public class MainEntry {
	public static void main(String[] args) {
		
		Tv t = new Tv();	// 생성자 함수 ( 객체 생성, 메모리 할당, 생성자 함수 자동 호출)
		
		Tv t2 = new Tv(25);
		t2.output();
		
		Tv t3 = new Tv("green");
		t3.output();
		
		Tv t4 = new Tv("pink", 99);
		t4.output();
		
		t.output(); 		// 초기값
		t.setChannel(5);	// setting
		t.setColor("검정");	// setting
		t.output();			// 출력
	}
}
