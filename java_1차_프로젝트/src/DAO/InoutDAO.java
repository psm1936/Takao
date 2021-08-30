package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import VO.AdminVO;
import VO.AllVO;

public class InoutDAO {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	int cnt = 0;
	String sql = "";
	AdminVO vo = null;
	

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
	
	public ArrayList<AllVO> allSelect() {
	      ArrayList<AllVO> al = new ArrayList<AllVO>();

	      getConn();
	      String sql = "select m.MEMBER_ID ,m.MEMBER_NAME , i.IN_DATE, i.OUT_DATE from  IN_OUT i INNER join MEMBER m on i.MEMBER_ID =m.MEMBER_ID ";

	      try {
	         psmt = conn.prepareStatement(sql);
	         rs = psmt.executeQuery();
	         while (rs.next()) {
	        	 String id = rs.getString(1);
	             String name = rs.getString(2);
	             String indate =""+rs.getTimestamp(3);
	             
	             String outdate = ""+rs.getTimestamp(4);
	       
	                  
	              AllVO vo = new AllVO();
	              vo.setId(id);
	              vo.setName(name);
	              vo.setIn_indate(indate);
	              vo.setIn_outdate(outdate);
	              al.add(vo);
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         close();
	      }
	      return al;
	   }
	public ArrayList<AllVO> select(String searchText) {
		 ArrayList<AllVO> al = new ArrayList<AllVO>();
      getConn();
      sql = "select  m.MEMBER_ID ,m.MEMBER_NAME , i.IN_DATE, i.OUT_DATE  from IN_OUT i INNER join MEMBER m on i.MEMBER_ID =m.MEMBER_ID and (m.MEMBER_ID=? or m.MEMBER_NAME=?) ";            
      try {
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, searchText);
         psmt.setString(2, searchText);
         rs = psmt.executeQuery();
         while (rs.next()) {
           String id = rs.getString(1);
           String name = rs.getString(2);
           String indate =""+ rs.getTimestamp(3);
           String outdate =""+ rs.getTimestamp(4);
          
               
            
            AllVO vo = new AllVO();
            vo.setId(id);
            vo.setName(name);
            vo.setIn_indate(indate);
            vo.setIn_outdate(outdate);
            al.add(vo);
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {    
         close();
      }
      return al;
		
	}
}
