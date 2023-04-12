package ex05.wraper;

class Point {}

public class MainEntry {
	public static void main(String[] args) {
		Integer Ia = new Integer(10);
		Integer Ib = new Integer("10");
		String su  = "30";
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		
		System.out.println(Ia);
		System.out.println(Ia.getClass().getName() + '@' +Integer.toHexString(Ia));
		
		int x = 77;
		double y = 5.5;
		System.out.println(x + ", " + y);
//		y = x; //묵시적 형변환 
		 x = (int)y; //명시적 형변환
		 System.out.println(x + ", " + y);
		
		 
		 //stack에서 heap으로 빠져나오는 것이 언박싱
		 //박싱 언박싱은 메모리공간이 바뀌는것
		 int c = Ia.intValue(); //jdk4.x 이전에 사용하전 메소드
		 int d = Ib; //jdk 5.x 이후부터 autoboxing, unboxing
		 int num = Integer.parseInt(su);
		 
		 System.out.println(c + num);
		 System.out.println(c + d);
		 System.out.println(Ia.MIN_VALUE); //-21억~
		 System.out.println(Ia.MAX_VALUE); //21억~
		 
		 
		 
		 //Double dd = 12.34;
		 Double dd = new Double(12.34);
		 System.out.println(dd);
		 System.out.println(dd.MIN_VALUE); //-21억~
		 System.out.println(dd.MAX_VALUE); //21억~
		 
		 System.out.println("---------------------------------");
		 c = (int)dd.doubleValue(); // 명시적 형변환
		 System.out.println("형변환 c의 값은?" + c);
	
	
		 int e = Integer.parseInt("123");
		 int f = Integer.parseInt("111111",2);
		 System.out.println(f);
		 System.out.println(e + 20);
		 
		 int xx = 3;  //stack memory에 저장
		 Integer yy = new Integer(3);   //heap memory에 
		 
		 xx = yy.intValue();
		 xx = yy; //autoboxing, unboxing
	
	
	
	
	}
}
