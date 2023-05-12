package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainEntry {
	
	public static void main(String[] args) throws Exception {
		
		//1. Driver load.... exception 발생
		
//		Class.forName("oracle.jdbc.OracleDriver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver load success!!");
		
		
		//2. Connection & Open
                     //driver : IP : portNumber:SID(or 전역 데이터베이스명)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "jihyo";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success@@");
		
		//3. 사용 (DML 명령어)
		//4. 닫기 (자원 반환)
	}
		//SQL과 Tag 는 자바에서 문자열 취급한다.
		
}
