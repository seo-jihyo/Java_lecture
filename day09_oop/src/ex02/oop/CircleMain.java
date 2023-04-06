package ex02.oop;

	

class Circle {
		private int x, y, r; // 멤버 변수
		
		public int getR() {
			return r;
		}
		public void setR(int r) {
			this.r = r;
		}
		public void display() {
			System.out.println(x + ", " +y+ ", " +r );
		}
	}
	
	
	
	public class CircleMain {
			public static void main(String[] args) {
				Circle c = new Circle(); // 객체 생성, 메모리 할당, 생성자 함수 자동 호출
			c.setR(5);
			System.out.println(c.getR());
			c.display();
	}
}
