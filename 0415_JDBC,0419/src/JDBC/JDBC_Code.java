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

		// Java파일과 Oracle을 연결시키는 순서
		// 1.Oracle에서 Java파일과 연결하기 위해 미리 개발해둔 lib을 import

		// Java 코드를 개발하면서 볼 수 있는 에러의 종류
		// 컴파일 에러 : 문법적인 에러(ex)괄호, for문 등)
		// 런타임 에러 : 실행을 해야지만 알 수 있는 에러
		// try ~ catch문 :예외처리
		try {
			// 코드가 실행되는 영역(try)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 가져온 lib파일에서 DB와 JAVA파일 연결할 수있는 class파일 실행
			Connection conn = DriverManager.getConnection(url, dbid, dbpw);
			// 3. DriverManager를 통해서 DB의 주소를 이동후 dbid와 dbpw를 판단
			// dbid와 dbpw가 정상이였을 때 Java파일에서 DB를 핸들링 할수 있는
			// Connection객체 리턴
			// ------------------- DB연결 끝 ------
			String sql = "insert into JDBC_member values(?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			// 4. 명령하고자 하는 sql문에 이상있는지 확인하고 없으면
			// 실제 명령을 실행 할 수 있는 PreparedStatement객체 리턴
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, tel);
			psmt.setString(4, email);
			psmt.setString(5, addr);
			// 사용자가 입력한 값을 sql문(?)에 대입하기 위한 명령

			// ---------------SQL문 명령 준비

			// 1. SQL문 명령이 잘 실행됬는지 판단
			int cnt = psmt.executeUpdate();
			// --------------SQL문 명령 실행
			if (cnt > 0) {
				System.out.println("입력성공");
			} else {
				System.out.println("입력실패");
			}

			// 2. 사용자에게 입력받을 값을 SQL문 명령실행

		} catch (Exception e) {

			// 코드에서 에러가 있을때 들어오는 영역(catch)
			System.out.println("try문에 에러가 발생.");
			e.printStackTrace(); // 어떤 에러인지 출력
		}

	}

}
