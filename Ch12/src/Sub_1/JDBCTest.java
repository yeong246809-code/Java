package Sub_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 날짜 : 2026-05-15
 * 이름 : 이찬영
 * 내용 : java JDBC 실습
 */
public class JDBCTest {

	public static void main(String[] args) {
		
		//DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "yeong246809";
		String pass = "246809";
		
		//1) 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//2) DB 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("데이터베이스 접속성공");
		}else {
			System.out.println("데이터베이스 접속실패");
			
		}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
