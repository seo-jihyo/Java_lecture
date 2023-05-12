package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftInsert3 {
	public static void main(String[] args) throws SQLException, Exception {
		
		Scanner sc = new Scanner(System.in);
	
	//1. Driver load.... exception 발생
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//2. Connection & Open
	Connection conn = DriverManager.getConnection(
	"jdbc:oracle:thin:@localhost:1521:orcl","jihyo","oracle");
	
	//3. 사용 (DML 명령어 - insert) - PreparedStatement
	System.out.println("Gift Table data input: 상품번호/상품명/최저가/최고가 =");
	String sql = "INSERT INTO GIFT VALUES(?,?,?,?)";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1, sc.nextInt());
	pstmt.setString(2, sc.nextLine());
	pstmt.setInt(3, sc.nextInt());
	pstmt.setInt(4, sc.nextInt());

	
	int result = pstmt.executeUpdate(); //반환값이 없는 경우 사용하는 함수이다. - insert, update, delete
	
	System.out.println(sql); //출력해서 확인한다.
	
	System.out.println(result + " 개 데이터 추가 성공함.");
	
	//4. 자원 반환 (닫기)
	pstmt.close(); conn.close();
	}
}
