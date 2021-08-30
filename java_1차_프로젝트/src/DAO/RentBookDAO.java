package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

import VO.AllVO;


public class RentBookDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	
	int cnt = 0;
	String sql = "";
	AllVO vo = null;
	LocalDate today = LocalDate.now();
	String inDay = ""+today;
	String outDay = ""+today;
	String exDay = ""+today.plusDays(14);
	

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
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<AllVO> allSelect() {
        ArrayList<AllVO> al = new ArrayList<AllVO>();

        getConn();
        sql = "select b.BOOK_NO, b.BOOK_NAME ,m.MEMBER_ID,m.MEMBER_NAME,r.RENTBOOK_OUTDATE,r.RENTBOOK_INDATE,r.RENTBOOK_EXDATE "
        		+ "from RentBook r INNER join BooK b  on r.BOOK_BOOK_NO = b.BOOK_NO INNER join  MEMBER m on r.MEMBER_ID =m.MEMBER_ID";

        try {
           psmt = conn.prepareStatement(sql);
           rs = psmt.executeQuery();
           while (rs.next()) {
              int book_no = rs.getInt(1);
             String book_name = rs.getString(2);
             String id = rs.getString(3);
             String name = rs.getString(4);
             Date outdate = rs.getDate(5);
             Date indate = rs.getDate(6);
             Date exdate = rs.getDate(7);
            
                 
              
              AllVO vo = new AllVO();
              vo.setBook_no(book_no);
              vo.setBook_name(book_name);
              vo.setId(id);
              vo.setName(name);
              vo.setOutdate(outdate);
              vo.setIndate(indate);
              vo.setExdate(exdate);
              al.add(vo);
           }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        } finally {
           // try문에서 예외상황이 발생하던 안하던 무조건 제일 마지막으로 실행되는 부분

           close();
        }
        return al;
     }
	public ArrayList<AllVO> select(String searchText) {
		 ArrayList<AllVO> al = new ArrayList<AllVO>();
        getConn();
        sql = "select b.BOOK_NO, b.BOOK_NAME ,m.MEMBER_ID,m.MEMBER_NAME,r.RENTBOOK_OUTDATE,r.RENTBOOK_INDATE,r.RENTBOOK_EXDATE "
        		+ "from RentBook r INNER join BooK b  on r.BOOK_BOOK_NO = b.BOOK_NO  INNER join  MEMBER m on r.MEMBER_ID =m.MEMBER_ID and b.Book_name like ?   ";
                    
        try {
           psmt = conn.prepareStatement(sql);
           psmt.setString(1, searchText+ "%");
           rs = psmt.executeQuery();
           while (rs.next()) {
              int book_no = rs.getInt(1);
             String book_name = rs.getString(2);
             String id = rs.getString(3);
             String name = rs.getString(4);
             Date outdate = rs.getDate(5);
             Date indate = rs.getDate(6);
             Date exdate = rs.getDate(7);
            
                 
              
              AllVO vo = new AllVO();
              vo.setBook_no(book_no);
              vo.setBook_name(book_name);
              vo.setId(id);
              vo.setName(name);
              vo.setOutdate(outdate);
              vo.setIndate(indate);
              vo.setExdate(exdate);
              al.add(vo);
           }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        } finally {
           // try문에서 예외상황이 발생하던 안하던 무조건 제일 마지막으로 실행되는 부분

           close();
        }
        return al;
		
	}
	public int rentbookInsert(int book_no, String id) {
		try {
			getConn();

			sql = "insert into rentbook(rentbook_no, rentbook_outdate, rentbook_exdate, book_book_no, member_id) "
					+ "values (seq_rentbook.nextval,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, outDay);
			psmt.setString(2, exDay);
			psmt.setInt(3, book_no);
			psmt.setString(4, id);


			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;

	}
	public ArrayList<AllVO> memberSelect(String memberid) {
		ArrayList<AllVO> al = new ArrayList<AllVO>();

		getConn();
		String sql1 = "select r.RENTBOOK_NO,b.BOOK_NO, b.BOOK_NAME ,m.MEMBER_ID,m.MEMBER_NAME,r.RENTBOOK_OUTDATE,r.RENTBOOK_INDATE,r.RENTBOOK_EXDATE "
				+ "from RentBook r INNER join BooK b  on r.BOOK_BOOK_NO = b.BOOK_NO INNER join  MEMBER m on r.MEMBER_ID =m.MEMBER_ID and m.MEMBER_ID = ?";

		try {
			psmt = conn.prepareStatement(sql1);
			psmt.setString(1, memberid);
			rs = psmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt(1);
				int book_no = rs.getInt(2);
				String book_name = rs.getString(3);
				String id = rs.getString(4);
				String name = rs.getString(5);
				Date outdate = rs.getDate(6);
				Date indate = rs.getDate(7);
				Date exdate = rs.getDate(8);

				AllVO vo = new AllVO();
				vo.setNo(no);
				vo.setBook_no(book_no);
				vo.setBook_name(book_name);
				vo.setId(id);
				vo.setName(name);
				vo.setOutdate(outdate);
				vo.setIndate(indate);
				vo.setExdate(exdate);
				al.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// try문에서 예외상황이 발생하던 안하던 무조건 제일 마지막으로 실행되는 부분

			close();
		}
		return al;
	}
	public int indayUpdate(int book_no) {
		try {
			getConn();

			sql = "update rentbook set rentbook_indate = ? where book_book_no = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, inDay);
			psmt.setInt(2, book_no);
			

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;

	}
	

	}

