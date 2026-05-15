package Sub_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 날짜 : 2026-05-15
 * 이름 : 이찬영
 * 내용 : java CRUD insert 실습
 */
public class DeleteTset {

	public static void main(String[] args) {
		
		//DB 정보
				String host = "jdbc:mysql://127.0.0.1:3306/studydb";
				String user = "yeong246809";
				String pass = "246809";
				
				
				try {
						
				//1) DB 접속
				Connection conn = DriverManager.getConnection(host, user, pass);
				
				//2) sql 실행 객체 생성
				Statement stmt = conn.createStatement();
				
				//3) sql 실행
				String sql = "DELETE FROM user1  WHERE userid = 'J101'";
				stmt.executeUpdate(sql);
				
				//4) sql 결과처리(select 작업일 경우)
				//5) DB 연결해제
				stmt.close();
				conn.close();
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Delete 완료");
	}
	
}
