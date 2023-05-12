package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class GiftUpdate {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
      //1. Driver load.... exception 발생
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         //2. Connection & Open
         Connection conn = DriverManager.getConnection(
         "jdbc:oracle:thin:@localhost:1521:orcl","jihyo","oracle");
         
         //3. 사용 (DML 명령어 - insert)   Statement / PreparedStatement 
         System.out.println("수정할 상품 번호 : ");
         int gno = Integer.parseInt(br.readLine());
         
//         String sql = "INSERT INTO GIFT VALUES(?,?,?,?)";   
           String sql = "UPDATE GIFT SET GNAME = ?, G_START = ?, G_END = ? WHERE GNO = ?";

         
         PreparedStatement pstmt = conn.prepareStatement(sql);
     StringTokenizer st = new StringTokenizer(br.readLine());    
         pstmt.setInt(4, gno);
         pstmt.setString(1, st.nextToken());
         pstmt.setInt(2, Integer.parseInt(st.nextToken()));
         pstmt.setInt(3, Integer.parseInt(st.nextToken()));        
         int result = pstmt.executeUpdate();

 		System.out.println(result + "개 데이터 수정 성공");

 		// 4. 자원반환(닫기)
 		pstmt.close();
 		conn.close();
   }
}