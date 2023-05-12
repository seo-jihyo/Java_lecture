package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.StringTokenizer;


public class GiftDelete{
   public static void main(String[] args) 
         throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st = new StringTokenizer(br.readLine());
    
     	//1. Driver load.... exception 발생
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         //2. Connection & Open
         Connection conn = DriverManager.getConnection(
         "jdbc:oracle:thin:@localhost:1521:orcl","jihyo","oracle");
         
         //3. 사용 (DML 명령어 - insert)   Statement / PreparedStatement 
         System.out.println("삭제하실 상품번호를 입력하세요.");
         String sql = "delete gift where gno=?";
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, Integer.parseInt(br.readLine()));
         int result = pstmt.executeUpdate(); //반환값이 없는 경우 - executeUpdate (insert, update, delete)

         System.out.println(result + "개 데이터 삭제 성공");

         //4. 자원반환(닫기)
         pstmt.close();  conn.close();
         

   }
}