package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05OneSelect implements Rule_inter {

	public void execute() {
		// ����ڿ��� id���� �Է� �޾Ƽ�
		// �ش� id ���� �����͸� �˻��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID >> ");
		String getid = sc.next();
				
		DAO dao=new DAO();
		VO vo =dao.DAO_OneSelect(getid);
		
		System.out.println("ID : "+ vo.getId());
		System.out.println("PW : "+ vo.getPw());
		System.out.println("TEL : "+ vo.getTel());
		System.out.println("EMAIL : "+ vo.getEmail());
		System.out.println("ADDRESS : "+ vo.getAddress());
		System.out.println("------------------------------");

	}

}
