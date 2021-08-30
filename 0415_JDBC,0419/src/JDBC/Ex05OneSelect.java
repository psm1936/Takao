package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05OneSelect implements Rule_inter {

	public void execute() {
		// 사용자에게 id값을 입력 받아서
		// 해당 id 값의 데이터만 검색하시오.
		
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
