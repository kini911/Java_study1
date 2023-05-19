package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	//DAO -> Data Access Object (데이터에 접근하는 객체 ->DB)
	//JDBC를 통해서 JAVA<->DB가 연결된다
	
	//java ->DB연결할때쓰는객체
	protected Connection conn = null;
	
	//Query문 (SQL, 질의)을 가지고 실행하는 객체
	protected PreparedStatement pstmt = null;
	
	//Query문 (SQL, 질의)을 가지고 실행하는 객체
	protected Statement stmt = null;
	
	//SELECT(조회) 결과 값을 반환받는 객체
	protected ResultSet rs = null;
	
	//DB 접속 정보
	String driver = "oracle.jdbc.driver.OracleDriver";	//-> JDBC 자바랑 DB연결시켜줌
	String url = "jdbc:oracle:thin:@localhost:1521:xe";	//localhost : IP / 1521 : port / xe : 이름
	String id = "HR";
	String pw = "1234";
	
	//DB연결 메소드
	public void conn() {
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			//2.DB연결
			conn = DriverManager.getConnection(url,id,pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//DB연결 해제 메소드 (종료는 실행의 역순으로 해야함)
	public void disconn() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			//else if 사용하면 위에는 닫히고 밑에는 안닫힐 수도 있음
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
