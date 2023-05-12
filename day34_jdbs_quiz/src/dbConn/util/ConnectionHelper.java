package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 DB 연결 정보 반복적인 코딩을 해결
 다른 클래스에서 아래 코드 구현을 하지 않도록 설계


	Class.forName("oracle.jdbc.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.30:1521:orcl","jihyo","oracle");// exception
 	
 	이런식으로 사용
 	ConnectionHelper.getConnection("mySql") or ("oracle")...
 	dsn ==> data source name
 */

public class ConnectionHelper {
	//method 접근지정자 : public static
	public static Connection getConnection(String dsn) {
		
		Connection conn = null;
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
		}finally {
			return conn;
		}
	}
	
	public static void menu() {
		System.out.println("\n=========JDBC Query==========");
		System.out.println(" 0.rollback");
		System.out.println(" 1.레코드 전체보기");
		System.out.println(" 2.레코드 삽입");
		System.out.println(" 3.레코드 수정");
		System.out.println(" 4.레코드 삭제");
		System.out.println(" 5.조건에 의한 검색(ex.gno)");
		System.out.println(" 6.프로그램 종료");
		System.out.println(" 9.commit");
		System.out.println(" >> 원하는 메뉴를 선택하세요");
		
		
	}
	
/*	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		
		Connection conn = null;
		try {
			if(dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kosaDB","userid", "pwd");
				System.out.println("mysql connection success!");
				
			}else if(dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.16:1521:orcl","userid", "pwd");// exception
				System.out.println("oracle connection success!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			return conn;
		}
	}
	*/
}
