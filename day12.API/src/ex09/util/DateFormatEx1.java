package ex09.util;
import java.util.Date;
import java.text.SimpleDateFormat;

class DateFormatEx1{
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);  //
		SimpleDateFormat sdf1, sdf4;
		sdf1 = new SimpleDateFormat("yy-MM-dd");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a EEEE");
		//							년도-달-일   시간:분:초 E/EEEE"
		System.out.println(sdf1.format(today));	// format(Date d)
		System.out.println(sdf4.format(today));
	}
}
//SimpleDateFormats 사용자가 원하는 날짜로 변경 -> 우리나라 날짜 타입으로 출력하거나 등