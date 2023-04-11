package ex03.multiImplement;

import ex02.Interface.IDraw;

public class MultiClass extends Shape implements IDraw, Test {

	private int num;
	
	public void display() {
		System.out.println("Multiclass method!!");
	}
	
	@Override
	public void testView() { // Test
		System.out.println("Test interface");
	}


	@Override
	public void draw() { // IDraw
		num = 88;
		System.out.println("IDraw interface" + num);
	}

	@Override
	public double calc(double x) { //Shape
		System.out.println("Shape interface");
		return 0;
	}

	@Override
	public void show(String name) { //Shape
		
	}

	@Override
	public void view(String name) {
		// TODO Auto-generated method stub
		
	}

}
