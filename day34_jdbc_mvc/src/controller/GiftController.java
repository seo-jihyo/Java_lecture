package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftVO;

public class GiftController { // controller

	// 연결, 삽입, 수정, 삭제, 검색 등
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static Connection conn = null;

	// connect
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// close
	public static void close() {
		try {

			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//menu
	public static void menu() throws SQLException{
		GiftVO vo = new GiftVO();
//		System.out.println("메뉴를 선택하세요. 0.  1.select All 2.insert ");
		while (true) {
			System.out.println();
			ConnectionHelper.menu();
			switch (sc.nextInt()) {
			case 0: System.out.println("Commit 하시겠습니까?(Y/N) ");
					System.out.println("Commit 미선택시 RollBack됩니다.");
					if (sc.next().equalsIgnoreCase("Y")) {
						conn.commit();  //예외 발생
						selectAll(vo.getClassName());
					} else {
						conn.rollback();
						selectAll(vo.getClassName());
					}
				break;
			case 1: selectAll(vo.getClassName());
				break;
			case 2: insert(); 
				break;
			case 3: update(vo.getClassName());
				break;
			case 4: delete(vo.getClassName());
				break;
			case 5: selectByGNO(vo.getClassName());
				break;
			case 6: close();
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
				break;
			case 9: conn.commit();
			System.out.println("성공적으로 커밋되었습니다.");
			break;

			default:
				break;
			}
		} // while end
		}// end menu
	

	//1. selectAll 
	public static void selectAll(String className) throws SQLException {
		rs = stmt.executeQuery("select * from " + className); //반환값 있는 경우
		
		ResultSetMetaData rsmd = rs.getMetaData(); //해당 테이블(객체)에 대한 정보
		int count = rsmd.getColumnCount();
		while(rs.next()) {
			for (int i = 1; i <= count; i++) {  //각 타입별로 출력하기
				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i)+":"+rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i)+":"+rs.getFloat(i) + " ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i)+":"+rs.getDouble(i) + " ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i)+":"+rs.getString(i) + " ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i)+":"+rs.getDate(i) + " ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i)+":"+rs.getString(i) + " ");
					break;
				}// switch end			 
			} //for end
			System.out.println();
		}//end while
	}//end select all
	
	//2. insert
	public static void insert() {
		System.out.print("GNO: ");			String gno = sc.next();
		System.out.print("GNAME: "); 		String gname = sc.next();
		System.out.print("G_START: "); 		String g_start = sc.next();
		System.out.print("G_END: "); 		String g_end = sc.next();
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO GIFT VALUES(?, ?, ?, ?)");
			pstmt.setString(1, gno);
			pstmt.setString(2, gname);
			pstmt.setString(3, g_start);
			pstmt.setString(4, g_end);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + " 개 데이터가 추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // insert end
	
	
	 // 3. update
	public static void update(String className) throws SQLException {
		selectAll(className);
		System.out.print("수정할 GNO: ");			String gno = sc.next();
		
		
		System.out.print("GNAME: "); 		String gname = sc.next();
		System.out.print("G_START: "); 		String g_start = sc.next();
		System.out.print("G_END: "); 		String g_end = sc.next();
		try {
			pstmt = conn.prepareStatement("update GIFT set gno=?, gname=?, g_start=?, g_end=? WHERE GNO = ? ");
			pstmt.setString(1, gno);
			pstmt.setString(2, gname);
			pstmt.setString(3, g_start);
			pstmt.setString(4, g_end);
			pstmt.setString(5, gno);
			
			int result = pstmt.executeUpdate();
			
		System.out.println(result + "개 데이터 수정 성공");
		
		} catch (Exception e) {
		e.printStackTrace();
		}    
	 }

	// 4. delete
	public static void delete(String className) throws SQLException {
		selectAll(className);
		System.out.print("삭제할 GNO: ");			String gno = sc.next();
		try {
			pstmt = conn.prepareStatement("DELETE GIFT WHERE GNO = ? ");
			pstmt.setString(1, gno);
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 데이터 삭제 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //delete end

	
	// 5. SelectByGno
	 public static void selectByGNO(String className) throws SQLException {
		 selectAll(className);
	        pstmt = conn.prepareStatement("select * from " + className +" where gno = ?");
	        System.out.print("검색할 상품의 GNO(숫자)를 입력: ");
	        int gno = sc.nextInt();
	        pstmt.setInt(1, gno);
	        rs = pstmt.executeQuery();
	        ArrayList<GiftVO> list = new ArrayList();
	        while (rs.next()) {
	            GiftVO gift = new GiftVO();
	            gift.setGno(rs.getInt("GNO"));
	            gift.setGname(rs.getString("GNAME"));
	            gift.setG_start(rs.getInt("G_START"));
	            gift.setG_end(rs.getInt("G_END"));
	            list.add(gift);
	        }
	        if (list.size() == 0) {
	            System.out.println("검색된 선물이 없습니다.");
	            System.out.println();
	            return;
	        }
	        for (GiftVO gift : list) {
	            System.out.println("GNO: " + gift.getGno());
	            System.out.println("GNAME: " + gift.getGname());
	            System.out.println("G_START: " + gift.getG_start());
	            System.out.println("G_END: " + gift.getG_end());
	            System.out.println();
	        }
	    }
	}
