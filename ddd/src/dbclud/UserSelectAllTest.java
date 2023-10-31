package dbclud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserSelectAllTest {

	public static void main(String[] args) {
		/*네트워크, sql 연결선언
		 * JDBC 드라이버 등록
		 * 연결하기
		 * db 처리 작업
		 * 매개 변수화된 sql문 작성 - 동적 바인딩
		 * ? 값 지정
		 * sql 실행 - 검색
		 * 검색한 데이터가 있으면(찾았으면)
		 * db에서 userid(칼럼은 소문자)를 꺼내옴
		 * 리스트에 user 객체 저장
		 * 스택구조이므로 종료 순서를 rs > pstmt > conn 으로 함
		 * 반드시 수행되는 구간
		 * 연결이 되어 있다면
		 * 연결 끊음
		 */
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
			
			String sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			List<User> userlist = new ArrayList<>();
			
			while(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				
				userList.add(user);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
