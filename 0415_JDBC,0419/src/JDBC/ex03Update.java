package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03Update implements Rule_inter {

	public void execute() {
		// ����ڿ��� id�� pw�� �Է¹��� ��
		// �ش� id�� pw�� �Է¹��� pw�� �����Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID >> ");
		String id = sc.next();
		System.out.print("PW >> ");
		String pw = sc.next();		
		
		DAO  dao = new DAO();
		int cnt = dao.DAO_update(id, pw);
	   

	}

}
