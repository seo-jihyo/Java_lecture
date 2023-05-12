package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class GiftInsert2 {
   public static void main(String[] args) 
         throws ClassNotFoundException, SQLException {
      
      //1. Driver load.... exception 발생
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         //2. Connection & Open
         Connection conn = DriverManager.getConnection(
         "jdbc:oracle:thin:@localhost:1521:orcl","jihyo","oracle");
         
         //3. 사용 (DML 명령어 - insert)   Statement / PreparedStatement 
         String sql = "INSERT INTO GIFT VALUES(?,?,?,?)";    //1 2 3 4
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, 20);
         pstmt.setString(2, "초콜렛");
         pstmt.setInt(3, 3000);
         pstmt.setInt(4, 9999);
         
         int result = pstmt.executeUpdate();  //반환값이 없는 경우 - executeUpdate (insert, update, delete)


         System.out.println(result+"개 데이터 추가 성공");
         
         //4. 자원반환(닫기)
         pstmt.close();  conn.close();
   }
}