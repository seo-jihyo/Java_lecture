package ex01.lambda;

//타입을 써야할 상황이 있다.
interface Message{ 
	void something(int x, int y );       //int return type X, parameter O
							//출력의 책임이 호출한 쪽에 있음
}
interface Talk{
	void something(String x, String y );
}
class Person{
	public void greeting(Message msg) {
		msg.something(3, 5);
		
	}
	public void greeting(Talk msg) { //Overload
		msg.something("Hello", "DaeBo!");
		
	}
}
public class MainEntry5 {
	public static void main(String[] args) {
		//Lambda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() {
			@Override
			public void something(int x, int y) {  //void -> int
				System.out.println("return type X, parameter O");
				System.out.println("x = " + x + ", y = " + y);
			}
		});
		System.out.println("-------------------------");
//		public  int sum(int x, int y ) { return x + y; }
//			(x, y) => {x + y}
		char ch = 'K';

		p.greeting((int x, int y) -> { //람다 형태,매개변수가 두 개일 때는 괄호 생략이 안됨
			//오버라이드 -> 자료형 생략 금지
			System.out.println("Lambda return type, Parameter O");
			System.out.println("x = " + x + ", y = " + y);
//			ch = 'P';  람다 안에서 값 변경 불가
			System.out.println(ch); //출력은 가능
			num = 500; // static 변수 값은 변경 가능
			System.out.println(num);
		});
	}
	static int num = 30;
}