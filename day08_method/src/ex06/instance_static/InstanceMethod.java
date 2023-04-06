package ex06.instance_static;
//반드시 객체 생성이 필요하다.
// ex. Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();  <-- nextInt() 등

class B {
	int x, y;
	
	//intstance method
	
	public void setData(int xx, int yy) {
		System.out.println(xx+","+yy);
	}
}//B class end

public class InstanceMethod {
	public static void main(String[] args) {
	
		B b = new B(); //객체 생성, 메모리에 할당, 생성자 함수 자동 호출
		
		b.setData(22, 55);
	}
}
