package ex06.instance_static;

// static method: 객체 생성 없이 바로 사용 가능함
// object.methodNAme();
// CalssName.methodName();

class A {
	int x, y;
	
	//static method
	public static void setData(int xx, int yy) {
		System.out.println(xx +","+yy);
	}

} //A class end


public class StaticMethod {
	public static void main(String[] args) {
	A a = new A(); //객체 생성, 메모리에 할당, 생성자 함수 자동 호출	
	
	a.setData(20, 33);   	//object.methodName();
	A.setData(100, 500);    // ClassName.methodName();
	
	a.x = 999;
	A.setData(3, 4);
	
	}
}
