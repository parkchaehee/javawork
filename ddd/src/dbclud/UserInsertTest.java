package dbclud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {
	public static void main(String[] args) {
/*네트워크, sql 연결선언
 * JDBC 드라이버 등록
 * 연결하기
 * db 처리 작업
 * 매개 변수화된 sql문 작성 - 동적 바인딩
 * ? 값 지정
 * sql 실행
 * auto commit이 됨
 * 반드시 수행되는 구간
 * 연결이 되어 있다면
 * 연결 끊음
 * */
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
			
			String sql = "INSERT INTO users(userid, username, userpassword, userage, useremail) "
					+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "admin0000");
			pstmt.setString(2, "관리자");
			pstmt.setString(3, "a1234");
			pstmt.setInt(4, 33);
			pstmt.setString(5, "admin0000@cloud.com");
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행의 수: " + rows);
			
		}  catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
		
	}

}
