package ex09.util;
import java.util.Calendar;
import java.util.GregorianCalendar;
class  GregorianCalendar1{
	public static void main(String[] args) {
		GregorianCalendar gcal = new GregorianCalendar();
		p("���� ��¥�� �ð� \n");
		p(gcal.get(Calendar.YEAR)+"��");
		p((gcal.get(Calendar.MONTH)+1)+"��");
		p(gcal.get(Calendar.DATE)+"��");
		if(gcal.isLeapYear(gcal.get(Calendar.YEAR)))
			p("\n�����Դϴ�.");
		else
			p("\n������ �ƴմϴ�.");
	}
	static void p(String str){
		System.out.print(str);
	}
}
