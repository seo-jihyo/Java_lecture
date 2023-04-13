package ex09.util;
import java.util.*;

class  CalendarEx5
{
	public static void main(String[] args) 
	{
		Calendar date = Calendar.getInstance();

		date.set(2005, 0, 31);	// 2005년 1월 31일
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1); 
		//roll 과 add는 더함
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+ (date.get(Calendar.MONTH)+1) + "�� " + date.get(Calendar.DATE) + "��";
	}
}