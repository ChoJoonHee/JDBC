package com.zerock.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

public class JdbcTest {
	
	
	/*
	 * src/test/java 폴더에는 자바클래스를 이용해서 여러 작업을 테스트 할 용도로 사용됩니다.
	 * @Test 어노테이션 붙은 메서드를 실행합니다. 
	 * @Run As - > jUnitTest 로 실행합니다.
	 */
	
	
	String url = "jdbc:mysql://localhost:3306/spring?serverTimezone=Asia/Seoul";
	String uid = "spring";
	String upw = "spring";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	@Test
	public void jdbc() {
		
		try {
			//JDBC드라이버 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement("select * from score01");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				String kor  = rs.getString("kor");
				String eng = rs.getString("eng");
				String math = rs.getString("math");
				
				System.out.println(name);
				System.out.println(kor);
				System.out.println(eng);
				System.out.println(math);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		
		
	}
	
}








