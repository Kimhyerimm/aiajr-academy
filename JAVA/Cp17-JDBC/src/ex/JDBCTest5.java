package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest5 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 0. 드라이버 라이브러리(LIB)추가
			// 1. 데이터베이스 드라이버 로드
			// Class.forName(드라이버 클래스 전체이름 - 패키지이름 포함하는 클래스 이름)
			// Oracle경우 : oracle.jdbc.driver.OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터베이스 연결
			
			//String url = "jdbc:oracle:thin:@주소:포트:데이터베이스이름";
			// 주소: loclahost or 127.0.0.1
			String url = "jdbc:oracle:thin:@loclahost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			//Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			// 3. SQL 처리
			//		Statement or PreparedStatement
			// pstmt = conn.prepareStatement(SQL 문장);
			String sql = "select * from dept where deptno _?";
			pstmt = conn.prepareStatement(sql);
			//변수 데이터 설정
			pstmt.setInt(1, 10);
			
			rs = pstmt.executeQuery();
			
			System.out.println("부서 리스트");
			System.out.println("===========================");
			//ResultSet -> 결과참조
			while(rs.next()) { 
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getInt("dname") + "\t");
				System.out.print(rs.getInt("loc") + "\n");
				
				System.out.println("=============================");
			}
			
			// 4. 데이터베이스 연결 종료 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
