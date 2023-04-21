//package ex01.lambda;
//
//interface Message{
//	void something(); //void, no parameter
//}
//class Person{
//	public void greeting(Message msg) {
//		msg.something();
//	}
//}
//public class MainEntry {
//	public static void main(String[] args) {
//		//Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() {
//			@Override
//			public void something() {
//				System.out.println("good morning");
//				System.out.println("한주 열공 하좌");
//			}
//		});
//		System.out.println("-------------------------");
////		public  int sum(int x, int y ) { return x + y; }
////			(x, y) => {x + y}
//		
//		p.greeting(() -> {
//			System.out.println("Lambda 안녕하세요");
//			System.out.println("한주 열공 하좌");
//		});
//	}
//}