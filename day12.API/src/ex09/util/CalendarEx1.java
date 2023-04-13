package ex09.util;
import java.util.*;
class  CalendarEx1{
	public static void main(String[] args) {
		final String[] day = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance(); //오늘 날짜
		date1.set(2002, 6, 14); 
		System.out.println("date1�� "+ toString(date1) + 
			day[date1.get(Calendar.DAY_OF_WEEK)]+"�����̰�,");
		System.out.println("����(date2)�� " + toString(date2) + 
									day[date2.get(Calendar.DAY_OF_WEEK)]+"�����Դϴ�.");
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("(date1)���� ����(date2)���� " +
																		difference +"�ʰ� �������ϴ�.");
		System.out.println("(day)�� ����ϸ� " + difference/(24*60*60) +"���Դϴ�.");	// 1�� = 24 * 60 * 60
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+ (date.get(Calendar.MONTH)+1) + 
										"�� " + date.get(Calendar.DATE) + "�� ";
	}
}