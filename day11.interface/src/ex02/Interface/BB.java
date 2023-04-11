package ex02.Interface;

import java.io.DataInput;

public class BB implements IDraw {
	@Override
	public void draw() {
		System.out.println("BB 클래스에서 인터페이스 IDraw");
	}

	@Override
	public void view(String name) {
		// TODO Auto-generated method stub
		
	}

}
