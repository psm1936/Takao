package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID >> ");
		String id = sc.next();
		System.out.print("PW >> ");
		String pw = sc.next();
		System.out.print("TEL >> ");
		String tel = sc.next();
		System.out.print("EMAIL >> ");
		String email = sc.next();
		System.out.print("ADDR >> ");
		String addr = sc.next();

		// JDBC (Java, DataBase,Connectivity)

		// Java���ϰ� Oracle�� �����Ű�� ����
		// 1.Oracle���� Java���ϰ� �����ϱ� ���� �̸� �����ص� lib�� import

		// Java �ڵ带 �����ϸ鼭 �� �� �ִ� ������ ����
		// ������ ���� : �������� ����(ex)��ȣ, for�� ��)
		// ��Ÿ�� ���� : ������ �ؾ����� �� �� �ִ� ����
		// try ~ catch�� :����ó��
		try {
			// �ڵ尡 ����Ǵ� ����(try)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. ������ lib���Ͽ��� DB�� JAVA���� ������ ���ִ� class���� ����
			Connection conn = DriverManager.getConnection(url, dbid, dbpw);
			// 3. DriverManager�� ���ؼ� DB�� �ּҸ� �̵��� dbid�� dbpw�� �Ǵ�
			// dbid�� dbpw�� �����̿��� �� Java���Ͽ��� DB�� �ڵ鸵 �Ҽ� �ִ�
			// Connection��ü ����
			// ------------------- DB���� �� ------
			String sql = "insert into JDBC_member values(?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			// 4. ����ϰ��� �ϴ� sql���� �̻��ִ��� Ȯ���ϰ� ������
			// ���� ����� ���� �� �� �ִ� PreparedStatement��ü ����
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, tel);
			psmt.setString(4, email);
			psmt.setString(5, addr);
			// ����ڰ� �Է��� ���� sql��(?)�� �����ϱ� ���� ���

			// ---------------SQL�� ��� �غ�

			// 1. SQL�� ����� �� ��������� �Ǵ�
			int cnt = psmt.executeUpdate();
			// --------------SQL�� ��� ����
			if (cnt > 0) {
				System.out.println("�Է¼���");
			} else {
				System.out.println("�Է½���");
			}

			// 2. ����ڿ��� �Է¹��� ���� SQL�� ��ɽ���

		} catch (Exception e) {

			// �ڵ忡�� ������ ������ ������ ����(catch)
			System.out.println("try���� ������ �߻�.");
			e.printStackTrace(); // � �������� ���
		}

	}

}
