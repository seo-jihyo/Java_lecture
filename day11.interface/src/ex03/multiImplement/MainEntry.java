package ex03.multiImplement;


import ex02.Interface.IDraw;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 자기자신으로 객체 생성
		MultiClass mc = new MultiClass();
		mc.testView();
		mc.draw();
		mc.display();
		
		// 2. 부모로 객체 생성
		Shape s = new MultiClass();
		s.show("도형이야");
		s.view();
		
		Test t = new MultiClass();
		t.testView();
		System.out.println();
		
		IDraw d = new MultiClass();
		d.draw();
		System.out.println(d.su);
		
		// 3. 
	}
}
