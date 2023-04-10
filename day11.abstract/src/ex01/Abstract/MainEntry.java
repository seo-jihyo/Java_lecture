package ex01.Abstract;

abstract class Shape {					//abstract class, super class
	double result = 0;
	public abstract double calc();		//abstract method
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
} //end of shape

//class Circle extends Shape {
//	error. 이유: 추상 클래스를 상속받은 자식 클래스에서는 추상 메서드를 꼬옥 반드시 받아서 오버라이드 해야함 (강제성)
//}
class Circle extends Shape{
	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이: " + result + "입니다.");
	}
}		//Circle end


class Rect extends Shape {
	int w = 3, h = 5;
	@Override
	public double calc() {
		result = w * h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이: " + result + "입니다.");
		
	}
}	// Rect end
class Triangle extends Shape {
	int w = 4, h = 5;
	@Override
	public double calc() {
		result = (w * h) / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이: " + result + "입니다.");
		
	}
}	// Tri end

public class MainEntry {
	public static void main(String[] args) {
		
		Circle c = new Circle();
//		c.calc();
		c.draw();
		
		Rect r = new Rect();
		r.draw();
		
		Triangle t = new Triangle();
		t.draw();
		
//		Shape sh = new Shape();  -->  자체적으로 객체 생성이 불가능
		Shape sh = new Circle();	//상속받은 자식 클래스로는 객체 생성 가능
		
	}
}
