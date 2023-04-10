package ex04.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		/*
		Circle c = new Circle();
//		System.out.println(c);  // 메모리 상의 주소 출력
		c.show();
		c.line();
		
		Triangle t = new Triangle();
		t.show();
		
		t.setH(20);
		t.setW(30);
		t.show();
		*/
	
		Shape sh1 = new Shape(); //부모를 통해 호출
		sh1.show();		//
		
		Shape sh = new Circle(); //Circle을 통해 호출
		sh.show();		//부모의 인스턴스로 호출
		
		sh = new Triangle();
		sh.show();
		//--------------------------------> 다형성의 모습
	}
	
}