package JDBC;
import java.util.Scanner;

public class Ex00Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		boolean sw = true;  // 스위칭 변수  while문 멈추는 방법
		Rule_inter inter = null;

		while (sw) {
			
			System.out.println("=== 회원 관리 시스템 ===");
			System.out.println("1.회원가입 2.회원삭제 3.회원수정 4.회원전체검색 5.회원검색 6.프로그램 종료");
			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("회원가입 기능 실행");
				inter = new Ex01Insert();             //업캐스팅 (중요함)
				inter.execute();
				break;
			case 2:
				System.out.println("회원삭제 기능 실행");
				inter = new ex02Delete();
				inter.execute();
				break;
			case 3:
				System.out.println("회원수정 기능 실행");
				inter = new ex03Update();
				inter.execute();
				break;
			case 4:
				System.out.println("회원전체검색 기능 실행");
				inter = new ex04Select();
				inter.execute();
				break;
			case 5:
				System.out.println("회원검색 기능 실행");
				inter = new Ex05OneSelect();
				inter.execute();
				break;
			case 6:
				System.out.println("프로그램 종료");
				sw = false;
				break;
			}
		}

		// 기능이 계속 반복되게 만들어야 함.
	}

}
