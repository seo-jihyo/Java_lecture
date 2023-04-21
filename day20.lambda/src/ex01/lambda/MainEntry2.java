//package ex01.lambda;
//
//interface Message{ 
//	int something();       //int return typeO, parameter X
//							//출력의 책임이 호출한 쪽에 있음
//}
//class Person{
//	public void greeting(Message msg) {
//		msg.something();
//		int su = msg.something();
//		System.out.println("Message interface something: " + su);
//	}
//}
//public class MainEntry2 {
//	public static void main(String[] args) {
//		//Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() {
//			@Override
//			public int something() {  //void -> int
//				System.out.println("return type");
//				System.out.println("한주 열공 하좌");
//				return 100; // return type
//			}
//		});
//		System.out.println("-------------------------");
////		public  int sum(int x, int y ) { return x + y; }
////			(x, y) => {x + y}
//		
//		p.greeting(() -> {
//			System.out.println("Lambda return type");
//			System.out.println("한주 열공 하좌");
//			return 200;   // return type
//		});
//	}
//}