package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import VO.AllVO;



public class MemberinoutDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	AllVO vo= null;
	int cnt = 0;
	String sql = "";
//	LocalDate today = LocalDate.now();
//	String getday= ""+ today;
	
//	Date time = new Date();
//	SimpleDateFormat formattime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	String todaytime = formattime.format(time);
	
	
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
	 //-------------------------------------------------------------------------------------------
	 public AllVO Checkselect(String id) {
			try {
				getConn();
				sql = "select INTOUT_CHECK from IN_OUT  where MEMBER_ID=id and INTOUT_CHECK='1'";
				psmt = conn.prepareStatement(sql);
				cnt = psmt.executeUpdate();
				psmt.setString(1, id);
				
				rs = psmt.executeQuery();
				while (rs.next()) {
				String  inout_check = rs.getString(1);
					
					vo = new AllVO();
		             vo.setIn_check(inout_check.charAt(0));
				}

			} catch (Exception e) {
				

				System.out.println("try문에 에러가 발생했습니다.");
				e.printStackTrace();
			}
			return vo;
		}
	
		 
	 
	 
	 
	 
	 
	 
	 
	 //------------------------------------------------------------------------------------------
	
	 
	 public int InInsert(String id) {
			try {
				getConn();
				
				sql = "insert into IN_OUT(INOUT_NO, INTOUT_CHECK,IN_DATE, MEMBER_ID)  values (seq_in_out.NEXTVAL,'1',sysdate,?) ";
				psmt = conn.prepareStatement(sql);
//				psmt.setString(1, todaytime);
//				psmt.setDate(1, todaytime);
				psmt.setString(1, id);
				cnt = psmt.executeUpdate();			
			} catch (Exception e) {
				System.out.println("try문에 에러가 발생했습니다.");
				e.printStackTrace();
			}
			return cnt;
		}
//-----------------------------------------------------------------------------------
	 public int Inupdate(String id) {

			try {
				getConn();

				sql = "update  IN_OUT  i set OUT_DATE=sysdate  ,INTOUT_CHECK='0' where  MEMBER_ID=? and  INTOUT_CHECK='1'";
				psmt = conn.prepareStatement(sql);
				//psmt.setString(1, todaytime);
				psmt.setString(1, id);
				
				cnt = psmt.executeUpdate();

			} catch (Exception e) {
				System.out.println("try문에 에러가 발생했습니다.");
				e.printStackTrace();
			}
			return cnt;
		}
}
