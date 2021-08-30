package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class DAO {
	// DAO : �����ͺ��̽��� ����Ǵ� �ϵ��� ó�����ִ� Java����
	// (�ߺ��Ǵ� �ڵ� �ּ�ȭ, ����)

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	String sql = "";
	int cnt = 0;
	VO vo = null;

	public void getConn() {
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, dbid, dbpw);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int DAO_insert(String id, String pw, String tel, String email, String addr) {

		try {

			getConn();

			sql = "insert into JDBC_member values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, tel);
			psmt.setString(4, email);
			psmt.setString(5, addr);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try���� ������ �߻�.");
			e.printStackTrace();
		}
		return cnt;
	}

	public int DAO_delete(String id) {

		try {

			getConn();

			sql = "delete from JDBC_member where id = ? ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("��������");
			} else {
				System.out.println("��������");
			}

		} catch (Exception e) {

			System.out.println("try���� ������ �߻�.");
			e.printStackTrace();
		}
		return cnt;

	}

	public int DAO_update(String id, String pw) {

		try {

			getConn();
			sql = "update JDBC_member set pw=? where id =?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, pw);
			psmt.setString(2, id);

			cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("���漺��");
			} else {
				System.out.println("�������");
			}

		} catch (Exception e) {

			System.out.println("try���� ������ �߻�.");
			e.printStackTrace();
		}
		return cnt;
	}

	public VO DAO_OneSelect(String getid) {
		try {
			getConn();

			sql = "select *from JDBC_member where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, getid);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String tel = rs.getString(3);
				String email = rs.getString(4);
				String address = rs.getString(5);

				vo = new VO(id, pw, tel, email, address);
				// VO : ���ϰ��� �����͸� �����Ҷ� �ϳ��ϳ��� ������ �����°� �ƴ϶�
				// ��� ����Ƽ�� ������ �� �ִ� ��ü

			}

		} catch (Exception e) {

			System.out.println("try���� ������ �߻�.");
			e.printStackTrace();
		}
		return vo;
	}

	public ArrayList<VO> DAO_select() {
		
		ArrayList<VO> arr = new ArrayList<VO>();
		
		try {

			getConn();
			sql = "select * from JDBC_member";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			// insert, update, delete : executeUpadte() -> ����������(��ɿ� ������ ��)
			// select : executeQuery() -> ���̺� �ִ� ���� ����

			while (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String tel = rs.getString(3);
				String email = rs.getString(4);
				String address = rs.getString(5);
				
				vo = new VO(id, pw, tel, email, address);
				
				arr.add(vo);

			}

		} catch (Exception e) {

			System.out.println("try���� ������ �߻�.");
			e.printStackTrace();
		}
		return arr;
	}

}
