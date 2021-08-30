package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VO.MemberVO;

public class MemberDAO {

   Connection conn = null;
   PreparedStatement psmt = null;
   int cnt = 0;
   String sql = "";
   ResultSet rs = null;
   MemberVO vo = null;

   public void getConn() {
      try {

         String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String dbid = "hr";
         String dbpw = "hr";

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

   public int joinInsert(String id, String pw, String name, String gender, String hobby) {

      try {
         getConn();

         sql = "insert into memberinfo values (?,?,?,?,?)";
         psmt = conn.prepareStatement(sql);

         psmt.setString(1, id);
         psmt.setString(2, pw);
         psmt.setString(3, name);
         psmt.setString(4, gender);
         psmt.setString(5, hobby);

         cnt = psmt.executeUpdate();

      } catch (Exception e) {
         System.out.println("try문에 에러가 발생했습니다.");
         e.printStackTrace();
      }

      return cnt;
   }

   public MemberVO loginSelect(String id, String pw) {

      try {

         getConn();

         sql = "select * from memberinfo where id = ? and pw = ?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         psmt.setString(2, pw);

         // 1
         rs = psmt.executeQuery();

         // insert, update, dedlete : executeUpdate() 명령문을사용 -> 정수형리턴(명령에 성공한 수)
         // select : executeQuery() -> 테이블에있는 값을 리턴

         // 2
         while (rs.next()) {

            String get_id = rs.getString(1);
            String get_pw = rs.getString(2);
            String get_name = rs.getString(3);
            String get_gender = rs.getString(4);
            String get_hobby = rs.getString(5);

            vo = new MemberVO(get_id, get_pw, get_name, get_gender, get_hobby);
            // VO/DTO : 파일간의 데이터를 공유할 때
            // 하나하나의 변수를 보내는게 아니라 묶어서 데이터를 전송할 수 있는 객체

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
      String sql = "select * from memberinfo";

      try {
         psmt = conn.prepareStatement(sql);
         rs = psmt.executeQuery();
         while (rs.next()) {
            String selId = rs.getString(1);
            String selPw = rs.getString(2);
            String selName = rs.getString(3);
            String selGender = rs.getString(4);
            String selHobby = rs.getString(5);
            MemberVO vo = new MemberVO(selId, selPw, selName, selGender, selHobby);
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
   public boolean delete(String id) {
         // TODO Auto-generated method stub
         boolean result = false;
         getConn();
         String sql = "delete from memberinfo where id=?";
         try {
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, id);

            int cnt = psmt.executeUpdate();
            
            if(cnt>0) {
               result = true;
            }else {
               result = false;
            }
         } catch (Exception e) {
            
            e.printStackTrace();
         }finally {
            close();
         }      
         return result;
      }

}