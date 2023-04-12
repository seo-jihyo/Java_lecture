package ex06.string;

public class StringMain {
	public static void main(String[] args) {
		int x = 3, y = 5;
		System.out.println("x= " + x + ", y= " + y);
		x = y;
		System.out.println("x= " + x + ", y= " + y); //stack 영역, 값만 바뀜 주소는 그대로
		
		String str1 = "korea";
		String str2 = "happy";
		System.out.println("str1= " + str1 + "\nstr2= " + str2);
		System.out.println("=============================");
		System.out.println("str1 hashcode: " + str1.hashCode() +"\nstr2 hashcode: " + str2.hashCode());
		System.out.println("=============================");
		
		str1 = str2;
		System.out.println("str1= " + str1 + "\nstr2= " + str2);
		System.out.println("str1 hashcode: " + str1.hashCode() +"\nstr2 hashcode: " + str2.hashCode());
		System.out.println("=============================");
		
		str2 = "seoul";
		System.out.println("str1= " + str1 + "\nstr2= " + str2);
		System.out.println("str1 hashcode: " + str1.hashCode() +"\nstr2 hashcode: " + str2.hashCode());
		System.out.println("=============================");
		
		str2 = "korea";
		System.out.println("str1= " + str1 + "\nstr2= " + str2);
		System.out.println("str1 hashcode: " + str1.hashCode() +"\nstr2 hashcode: " + str2.hashCode());
		System.out.println("=============================");
		// 같은 글자를 쓰면 다시 돌아감
		
		//새로 만들어도 같은 문자열이라면 주소를 공유함
		String str3 = "korea";
		str2 = "korea";
		System.out.println("str2= " + str2 + "\nstr3= " + str3);
		System.out.println("str2 hashcode: " + str2.hashCode() +"\nstr3 hashcode: " + str3.hashCode());
		System.out.println("=============================");
		
		str3 = "jihyo";
		System.out.println("str2 hashcode: " + str2.hashCode() +"\nstr3 hashcode: " + str3.hashCode());
		// 또 다른 문자열이 들어가면 다른 주소로 변경됨
		System.out.println("=============================");
		
		str1 = "jihyo";
		System.out.println("str1 hashcode: " + str1.hashCode() +"\nstr3 hashcode: " + str3.hashCode());
	}
}
//메모리 낭비함 -> StringBuffer 사용하게됨