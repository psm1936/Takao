package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      System.out.print("ID>>");
	      String id = sc.next();
	      System.out.print("CHOICE>>");
	      String choice = sc.next();   
	      System.out.print("DATA>>");
	      String data = sc.next();
	      
	      try {

	         String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	         String dbid = "hr";
	         String dbpw = "hr";
	         
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         Connection conn = DriverManager.getConnection(url, dbid, dbpw);
	         

	         String sql ="";
	         if(choice.equals("1")) {
	        	 sql = " update JDBC_member set pw = ? where id = ?";		       
	         }else if(choice.equals("2")) {
	        	 sql = " update JDBC_member set tel = ? where id = ?";		        
	         }
	         
	         PreparedStatement psmt = conn.prepareStatement(sql);
	         
	         psmt.setString(1, data);		         
	         psmt.setString(2, id);

	         int cnt = psmt.executeUpdate();

	         if(cnt>0) {
	            System.out.println("��������");
	         }else {
	            System.out.println("��������");
	         }
	         
	        

	      }catch(Exception e) {
	         System.out.println("try���� ������ �߻��߽��ϴ�.");
	         e.printStackTrace();
	      }	
	      }

}
