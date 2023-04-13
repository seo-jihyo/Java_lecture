package ex08.utilPackage;
//util.*은 메모리 낭비 단점이 있다.
import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		

		Calendar c =  Calendar.getInstance(); //System이 갖고 있는 날짜 얻어옴
		
		System.out.println(c.get(Calendar.YEAR)+"년");
		System.out.println(c.get(Calendar.MONTH)+ 1 +"월"); //월은 0부터 시작한다.
		System.out.println(c.get(Calendar.DATE)+"일");
		System.out.println("========================");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 "+h+" : "+m+" : "+ s);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2018,12,20,0,0);
		
		if (c1.after(c2)) {
			System.out.println("현재 시간은 2018년 1월 1일 이후입니다.");
		} else if (c1.before(c2))
			System.out.println("현재 시간은 2018년 1월 1일 이전입니다.");
		{if (c1.equals(c2)) {
			System.out.println("현재 시간은 2018년 1월 1일입니다.");
		}
		
				
		
				
		//		System.out.println(c);
		
		}
}
}