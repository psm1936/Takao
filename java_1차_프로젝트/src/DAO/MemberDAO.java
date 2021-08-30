package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import VO.BookVO;
import VO.MemberVO;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	int cnt = 0;
	String sql = "";
	MemberVO vo = null;
	

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
	
	 public void close() {
	      
	      try {
	         if(rs!=null) {
	            rs.close();
	         }
	         if(psmt!=null) {
	            psmt.close();
	         }
	         if(conn!=null) {
	            conn.close();
	         }
	         
	      } catch (Exception e) {
	         
	         e.printStackTrace();
	      }
	      
	   }
				
	public int joininsert(String id, String pw, String name, String tel, String address) {
		try {
			getConn();

			sql = "insert into member values (?,?,?,?,?,0,0,'admin')";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, tel);
			psmt.setString(5, address);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;

	}
	
	public MemberVO loginSelect(String getid, String getpw) {
		try {
			getConn();

			sql = "select * from member where member_id = ? and member_pw = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, getid);
			psmt.setString(2, getpw);
	
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

				vo = new MemberVO(id, pw, name, tel, address, donscore, readscore, admin_id);
				
			}

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return vo;
	}
	
	public ArrayList<MemberVO> allSelect() {
		ArrayList<MemberVO> mem = new ArrayList<MemberVO>();

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

				vo = new MemberVO(id, pw, name, tel, address, donscore, readscore, admin_id);

				mem.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// try문에서 예외상황이 발생하던 안하던 무조건 제일 마지막으로 실행되는 부분
			close();			
		}
		return mem;
		
	}

	public ArrayList<MemberVO> select(String combo, String searchText) {
		
		ArrayList<MemberVO> al = new ArrayList<MemberVO>();
		String choice = "";
		if(combo.equals("아이디")) {
			choice = "member_id";
		}else if(combo.equals("이름")) {
			choice = "member_name";
		}
		getConn();
		String sql = "select * from member where " + choice +  " like ?";
		//"select * from member where " + choice + " = ?"; // 요부분
		// 
		
		
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, searchText+'%');
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				String addr = rs.getString(5);
				int donscore = rs.getInt(6);
				int readscore = rs.getInt(7);
				String adminid = rs.getString(8);

				vo = new MemberVO(id, pw, name, tel, addr, donscore, readscore,adminid);
				al.add(vo);

			}

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return al;
	}

	public int update(String id, String pw, String name, String tel, String addr, int donscore, int readscore,
			String adminid) {
		try {
			getConn();

			sql = "update member set member_pw = ?, member_name = ?, "
					+ "member_tel = ?, member_addr = ?, member_donscore = ?, member_readscore = ? where member_id = ?";
			psmt = conn.prepareStatement(sql); 
			
			psmt.setString(1, pw);
			psmt.setString(2, name);
			psmt.setString(3, tel);
			psmt.setString(4, addr);
			psmt.setInt(5, donscore);
			psmt.setInt(6, readscore);
			psmt.setString(7, id);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;
		
		
		
	}
	
	public MemberVO oneSelect(String Member_id) {
		try {
			getConn();

			sql = "select * from member where member_id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, Member_id);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				String addr = rs.getString(5);
				int donscore = rs.getInt(6);
				int readscore = rs.getInt(7);
				String adminid = rs.getString(8);

				vo = new MemberVO(id, pw, name, tel, addr, donscore, readscore,adminid);
				

			}

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return vo;
	}
	
	
	public boolean delete(String member_id) {
	      // TODO Auto-generated method stub
	      boolean result = false;
	      getConn();
	      String sql = "delete from member where member_id=?";
	      try {
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, member_id);

	         int cnt = psmt.executeUpdate();
	         
	         if(cnt>0) {
	            result = true;
	         }else {
	            result = false;
	         }
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         close();
	      }      
	      return result;
	   }
	public ArrayList<MemberVO> OneSelect() {
		ArrayList<MemberVO> mem = new ArrayList<MemberVO>();

		getConn();
		String sql = "select member_id from member";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				
				vo = new MemberVO(id);

				mem.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// try문에서 예외상황이 발생하던 안하던 무조건 제일 마지막으로 실행되는 부분

			
		}
		return mem;
	}
	
	
	
	
}
