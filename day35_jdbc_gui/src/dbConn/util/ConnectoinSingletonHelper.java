package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 ConnectoinHelper 클래스의 문제: 연결과 연결해제의 반복은 리소스 낭비. 성능 저하
 매번 드라이버 로드, Connection 생성하는 것을 하나의 프로세스에서 하나만 만들어서 재사용하게끔 구현해 함
 
 해결 방법: 공유자원(싱글톤)
 */

public class ConnectoinSingletonHelper {
 // 하나의 프로세스에서 공통으로 사용할 수 있는 공용 자원 (static)
 //	private static(프라이빗, 공유)
	private static Connection conn;
	private ConnectoinSingletonHelper() {}

	public static Connection getConnection(String dsn) {
		if(conn != null) { //이미 가지고 있다면 return
			return conn;  
		}
		
		try {
			if(dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kosaDB","userid", "pwd");
				System.out.println("mysql connection success!");
			
			}else if(dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.16:1521:orcl","jihyo", "oracle");// exception
				System.out.println("oracle connection success!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	public static void close() throws SQLException {
		if (conn != null) {
			if (conn.isClosed()) {
				conn.close();
			}
		}
	}
}
