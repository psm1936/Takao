package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import VO.AdminVO;
import VO.BookVO;
import VO.MemberVO;

public class AdminDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	int cnt = 0;
	String sql = "";
	AdminVO vo = null;
	MemberVO membervo = null;
	

	public void getConn() {
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "book_project";
			String dbpw = "1234";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, dbid, dbpw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public AdminVO loginSelect(String getid, String getpw) {
		try {
			getConn();

			sql = "select * from admin where admin_id = ? and admin_pw = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, getid);
			psmt.setString(2, getpw);
	
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				

				vo = new AdminVO(id, pw, name);
				
			}

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return vo;
	}
	public ArrayList<MemberVO> allSelect() {
		ArrayList<MemberVO> al = new ArrayList<MemberVO>();

		getConn();
		String sql = "select * from member";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				String address = rs.getString(5);
				int donscore = rs.getInt(6);
				int readscore = rs.getInt(7);
				String admin_id = rs.getString(8);
				MemberVO membervo = new MemberVO(id, pw, name, tel, address, donscore, readscore, admin_id);
				al.add(membervo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			return al;
	}
	
	
	
	
}
