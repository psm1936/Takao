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
         System.out.println("try���� ������ �߻��߽��ϴ�.");
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

         // insert, update, dedlete : executeUpdate() ��ɹ������ -> ����������(��ɿ� ������ ��)
         // select : executeQuery() -> ���̺��ִ� ���� ����

         // 2
         while (rs.next()) {

            String get_id = rs.getString(1);
            String get_pw = rs.getString(2);
            String get_name = rs.getString(3);
            String get_gender = rs.getString(4);
            String get_hobby = rs.getString(5);

            vo = new MemberVO(get_id, get_pw, get_name, get_gender, get_hobby);
            // VO/DTO : ���ϰ��� �����͸� ������ ��
            // �ϳ��ϳ��� ������ �����°� �ƴ϶� ��� �����͸� ������ �� �ִ� ��ü

         }

      } catch (Exception e) {
         System.out.println("try���� ������ �߻��߽��ϴ�.");
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
         // try������ ���ܻ�Ȳ�� �߻��ϴ� ���ϴ� ������ ���� ���������� ����Ǵ� �κ�

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