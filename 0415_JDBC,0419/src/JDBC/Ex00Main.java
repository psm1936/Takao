package JDBC;
import java.util.Scanner;

public class Ex00Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		boolean sw = true;  // ����Ī ����  while�� ���ߴ� ���
		Rule_inter inter = null;

		while (sw) {
			
			System.out.println("=== ȸ�� ���� �ý��� ===");
			System.out.println("1.ȸ������ 2.ȸ������ 3.ȸ������ 4.ȸ����ü�˻� 5.ȸ���˻� 6.���α׷� ����");
			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("ȸ������ ��� ����");
				inter = new Ex01Insert();             //��ĳ���� (�߿���)
				inter.execute();
				break;
			case 2:
				System.out.println("ȸ������ ��� ����");
				inter = new ex02Delete();
				inter.execute();
				break;
			case 3:
				System.out.println("ȸ������ ��� ����");
				inter = new ex03Update();
				inter.execute();
				break;
			case 4:
				System.out.println("ȸ����ü�˻� ��� ����");
				inter = new ex04Select();
				inter.execute();
				break;
			case 5:
				System.out.println("ȸ���˻� ��� ����");
				inter = new Ex05OneSelect();
				inter.execute();
				break;
			case 6:
				System.out.println("���α׷� ����");
				sw = false;
				break;
			}
		}

		// ����� ��� �ݺ��ǰ� ������ ��.
	}

}
