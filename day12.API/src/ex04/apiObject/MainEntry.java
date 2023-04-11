package ex04.apiObject;

class Point{}

public class MainEntry { //object class
	
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code: " + pt.hashCode());  //1651191114
		System.out.println("Object String: " + pt); //s.o.pln(pt)
		System.out.println("Object String: " + pt.toString());
		System.out.printf("10진수 주소 %d\n",0x626b2d4a);
		System.out.println("=========================================");
		
		
		Point pt2 = new Point();
		System.out.println("Point pt2 information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code: " + pt2.hashCode());
		System.out.println("Object String: " + pt2); //s.o.pln(pt)
		System.out.println("Object String: " + pt2.toString());
		System.out.printf("10진수 주소 %d\n",0x7a79be86);
		System.out.println("=========================================");
		
		System.out.println("pt2.toString() : toString()의 의미");
		System.out.println(pt2.getClass().getName()+ '@' +Integer.toHexString(pt2.hashCode()));
				
		Point pt3 = new Point();
		if (pt.hashCode() == pt3.hashCode()) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		
		Point pt4 ;
		pt4=pt;
		
		if (pt.hashCode() == pt4.hashCode()) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
	}
}
