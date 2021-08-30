package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ex04Select implements Rule_inter {

	public void execute() {
		
		DAO dao= new DAO();
		ArrayList<VO> arr =dao.DAO_select();		
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("ID : "+ arr.get(i).getId());
			System.out.println("PW : "+ arr.get(i).getPw());
			System.out.println("TEL : "+ arr.get(i).getTel());
			System.out.println("EMAIL : "+ arr.get(i).getEmail());
			System.out.println("ADDRESS : "+ arr.get(i).getAddress());
			System.out.println("------------------------------");
		}		
		
	}

}
