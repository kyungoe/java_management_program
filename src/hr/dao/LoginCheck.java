package hr.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exam.util.DBCon;

public class LoginCheck {
	private PreparedStatement pstmt ;
	private ResultSet rs;
	
	public boolean loginChk(String id, String pw) {
		String query = "SELECT * FROM t_member WHERE id=? AND pw=?";
		try {
			pstmt = DBCon.getConnection().prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {		return true;	}//실행 결과가 있으면 로그인 성공
		} catch (SQLException e) {	e.printStackTrace();
		} finally {					DBCon.close(rs, pstmt);	}
		return false; 
	}
}	




