package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex02Delete implements Rule_inter {

	public void execute() {
		// ����ڿ��� id���� �Է¹޾� �ش� id���� ���̺��� ���� �Ͻÿ�.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID >> ");
		String id = sc.next();
		
		DAO dao= new DAO();
		int cnt = dao.DAO_delete(id);
		
		if (cnt > 0) {
			System.out.println("��������");
		} else {
			System.out.println("��������");
		}
	}

}
