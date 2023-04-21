//package ex01.lambda;
//
//interface Message{ 
//	int something(int x);       //int return type O, parameter O
//							//출력의 책임이 호출한 쪽에 있음
//}
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something(30);
//		System.out.println("Message interface something: " + su);
//	}
//}
//public class MainEntry3 {
//	public static void main(String[] args) {
//		//Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() {
//			@Override
//			public int something(int x) {  //void -> int
//				System.out.println("return type, parameter O");
//				System.out.println("한주 열공 하좌");
//				return 50; // return type
//			}
//		});
//		System.out.println("-------------------------");
////		public  int sum(int x, int y ) { return x + y; }
////			(x, y) => {x + y}
//		
//		
////		p.greeting( x -> {
//		p.greeting((x) -> { //람다 형태,매개변수가 하나일 때 자료형 안써도됨, 괄호도 써도 되도 안써도 됨
//			System.out.println("Lambda return type, Parameter O");
//			System.out.println("한주 열공 하좌");
//			return 20;   // return type
//		});
//	}
//}