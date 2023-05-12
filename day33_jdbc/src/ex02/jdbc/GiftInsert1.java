package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert1 {
   public static void main(String[] args) 
         throws ClassNotFoundException, SQLException {
      
      //1. Driver load.... exception 발생
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         //2. Connection & Open
         Connection conn = DriverManager.getConnection(
         "jdbc:oracle:thin:@localhost:1521:orcl","jihyo","oracle");
         
         //3. 사용 (DML 명령어 - insert)   Statement / PreparedStatement
         Statement stmt = conn.createStatement();
//         insert into gift values(11, '종합과자', 1000, 20000)
         //1) 고정값 레코드 입력
//         String sql = "INSERT INTO GIFT VALUES(11, '종합과자', 1000, 20000)";  //auto commit
         
         //2) 레코드값 입력 받아서 처리  - Scanner, IO, main args
         String sql = "INSERT INTO GIFT VALUES("+args[0]+",'"+args[1]+"',"+args[2]+","+args[3]+")"; 
         System.out.println(sql);   //출력해서 확인 (에러 확인 가능)
         
         //
         
         int result = stmt.executeUpdate(sql);  //
         System.out.println(result+"개 데이터 추가 성공");
         
         //4. 자원반환(닫기)
         stmt.close();  conn.close();
   }
}