package ex01.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) {
		Connection conn = ConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			//SQL 구문, HTML Tag는 Java/JSP/Servlet에서 문자열 취급한다.
			String sql = "CREATE TABLE KOSADB(NAME VARCHAR2(20), AGE NUMBER)";
			System.out.println(sql.toString());
			stmt.executeUpdate(sql); //반환값이 없는 경우
			
			sql = "INSERT INTO KOSADB VALUES('YUNA', 33)";
			int result = stmt.executeUpdate(sql);
  			
			sql = "SELECT * FROM KOSADB";
			rs = stmt.executeQuery(sql); //반환값이 있는 경우
			
			System.out.println(result + "개 추가됨");
			
			while (rs.next()) {
				System.out.print("name: " + rs.getString(1)+"\t");
				System.out.println("age: " + rs.getInt("age"));
			}
			
			// conn.commit();
			
			sql = "DROP TABLE KOSADB PURGE";
			stmt.executeUpdate(sql);
			System.out.println(result + "개 삭제됨");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			CloseHelper.close(rs);		CloseHelper.close(stmt);	CloseHelper.close(conn);
			
		}
	}
}
