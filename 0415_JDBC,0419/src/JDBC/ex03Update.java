package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03Update implements Rule_inter {

	public void execute() {
		// 사용자에게 id와 pw를 입력받은 후
		// 해당 id의 pw를 입력받은 pw로 변경하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID >> ");
		String id = sc.next();
		System.out.print("PW >> ");
		String pw = sc.next();		
		
		DAO  dao = new DAO();
		int cnt = dao.DAO_update(id, pw);
	   

	}

}
