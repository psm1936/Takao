package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import VO.BookVO;
import VO.MemberVO;

public class BookDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	int cnt = 0;
	String sql = "";
	BookVO vo = null;

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
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int joininsert(String name, String comp, String author, String genre, String text, String doname) {
		try {
			getConn();

			sql = "insert into book values (seq_book.nextval,?,?,?,?,?,?,'0','admin')";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setString(2, comp);
			psmt.setString(3, author);
			psmt.setString(4, genre);
			psmt.setString(5, text);
			psmt.setString(6, doname);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;

	}

	public ArrayList<BookVO> allSelect() {
		ArrayList<BookVO> al = new ArrayList<BookVO>();

		getConn();
		String sql = "select * from book";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {

				int no = rs.getInt(1);
				String name = rs.getString(2);
				String comp = rs.getString(3);
				String author = rs.getString(4);
				String genre = rs.getString(5);
				String text = rs.getString(6);
				String doname = ""+rs.getString(7);
				char rent = rs.getString(8).charAt(0);
				String admin_id = rs.getString(9);
				BookVO vo = new BookVO(no, name, comp, author, genre, text, doname, rent, admin_id);
				al.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// try문에서의 예외상황이 발생하든지 하지 않든지 제일 마지막으로 무조건 실행하는 부분
			close();
		}
		return al;
	}

	public ArrayList<BookVO> select(String combo, String searchText) {
		ArrayList<BookVO> al = new ArrayList<BookVO>();
		String choice = "";
		if (combo.equals("도서명")) {
			choice = "book_name";
		} else if (combo.equals("출판사명")) {
			choice = "book_comp";
		} else if (combo.equals("저자명")) {
			choice = "book_author";
		} else if (combo.equals("장르명")) {
			choice = "book_genre";
		}

		getConn();
		String sql = "select * from book where " + choice + " like ?";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, searchText+'%');

			rs = psmt.executeQuery();
			while (rs.next()) {

				int no = rs.getInt(1);
				String name = rs.getString(2);
				String comp = rs.getString(3);
				String author = rs.getString(4);
				String genre = rs.getString(5);
				String text = rs.getString(6);
				String doname = ""+ rs.getString(7);
				char rent = rs.getString(8).charAt(0);
				String admin_id = rs.getString(9);
				BookVO vo = new BookVO(no, name, comp, author, genre, text, doname, rent, admin_id);
				al.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// try문에서의 예외상황이 발생하든지 하지 않든지 제일 마지막으로 무조건 실행하는 부분
			close();
		}
		return al;
	}

	public BookVO oneSelect(int book_no) {
		try {
			getConn();

			sql = "select * from book where book_no = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, book_no);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String comp = rs.getString(3);
				String author = rs.getString(4);
				String genre = rs.getString(5);
				String text = rs.getString(6);
				String doname = ""+ rs.getString(7);
				char rent = rs.getString(8).charAt(0);
				String admin_id = rs.getString(9);

				vo = new BookVO(no, name, comp, author, genre, text, doname, rent, admin_id);

			}

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return vo;
	}

	public BookVO memberoneSelect(int book_no) {
		try {
			getConn();

			sql = "select * from book where book_no = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, book_no);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String comp = rs.getString(3);
				String author = rs.getString(4);
				String genre = rs.getString(5);
				String text = rs.getString(6);
				char rent = rs.getString(8).charAt(0);

				vo = new BookVO(no, name, comp, author, genre, text, rent);

			}

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return vo;
	}

	public int update(int book_no, String name, String comp, String author, String genre, String text, String doname) {
		try {
			getConn();

			sql = "update book set book_name = ?, book_comp = ?, "
					+ "book_author = ?, book_genre = ?, book_text = ?, book_doname = ? where book_no = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setString(2, comp);
			psmt.setString(3, author);
			psmt.setString(4, genre);
			psmt.setString(5, text);
			psmt.setString(6, doname);
			psmt.setInt(7, book_no);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;

	}

	public int rentoutupdate(int book_no) {
		try {
			getConn();

			sql = "update book set book_rent = '1' where book_no = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, book_no);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;

	}

	public int rentinupdate(int book_no) {
		try {
			getConn();

			sql = "update book set book_rent = '0' where book_no = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, book_no);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;

	}

	public boolean delete(int book_no) {
		// TODO Auto-generated method stub
		boolean result = false;
		getConn();
		String sql = "delete from book where book_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book_no);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}
	//================================================================================반 납  스코어	
		public int rentscore( String id) {//반납 했을때 점수 올려주는 메소드
			try {
				getConn();

				sql = "update member set MEMBER_READSCORE = MEMBER_READSCORE+'2' where MEMBER_ID= ?";
				psmt = conn.prepareStatement(sql);

				psmt.setString(1, id);

				cnt = psmt.executeUpdate();

			} catch (Exception e) {

				System.out.println("try문에 에러가 발생했습니다.");
				e.printStackTrace();
			}
			return cnt;

		}
	// 반납 스코어=====================================
	//  기부 스코어=============================================
		public int donscore(String name) {
			try {
				getConn();

				sql = "update member set MEMBER_DONSCORE = MEMBER_DONSCORE+'10' where MEMBER_NAME= ?";
				psmt = conn.prepareStatement(sql);

				psmt.setString(1, name);

				cnt = psmt.executeUpdate();

			} catch (Exception e) {

				System.out.println("try문에 에러가 발생했습니다.");
				e.printStackTrace();
			}
			return cnt;

		}
	//=========================================기부
	//=====================================기부자 목록 불러 오기==========
		public ArrayList<BookVO> doallSelect() {
			ArrayList<BookVO> al = new ArrayList<BookVO>();

			getConn();
			String sql = "select*from BOOK where not BOOK_DONAME is null";

			try {
				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();
				while (rs.next()) {

					int no = rs.getInt(1);
					String name = rs.getString(2);
					String comp = rs.getString(3);
					String author = rs.getString(4);
					String genre = rs.getString(5);
					String text = rs.getString(6);
					String doname =rs.getString(7);
					char rent = rs.getString(8).charAt(0);
					String admin_id = rs.getString(9);
					BookVO vo = new BookVO(no, name, comp, author, genre, text, doname, rent, admin_id);
					al.add(vo);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				// try문에서의 예외상황이 발생하든지 하지 않든지 제일 마지막으로 무조건 실행하는 부분
				close();
			}
			return al;
		}

}
