package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		//1. Driver load.... exception 발생
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. Connection & Open
		Connection conn = DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl","jihyo","oracle");
		
		//3. 사용 (DML 명령어 - select)
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from GIFT");
		//반환값이 있는 경우 ezecuteQuery() - select
		System.out.println("상품번호\t사움명\t최저가\t최고가");
		
		while (rs.next()) { //다음으로 내려줌
			int gno = rs.getInt(1);  //rs.getXXX(인덱스 번호); rs.getXXX"필드먐[/
			String gname= rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno + "\t"+ gname + "\t"+ g_s + "\t"+g_e);
			
		}
		//4. 닫기 (자원 반환)
		rs.close(); 
		stmt.close();
		conn.close();
	}
}
