package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex01Insert implements Rule_inter {

	public void execute(){
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
		
		DAO  dao = new DAO();
		int cnt = dao.DAO_insert(id, pw, tel, email, addr);
	   
	    if(cnt>0) {
    		System.out.println("�Է¼���");
    	}else {
    		System.out.println("�Է½���");
    	}
	    
	}

}
