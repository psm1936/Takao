import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ����Ī ����
		boolean sw = true; // true �϶� ���ѹݺ� false�� ������.
		
		
		while (sw) {
			System.out.print("�ݾ� : ");
			int money = sc.nextInt();
			System.out.println("�޴� : 1��>�ݶ�800��  2��>����500��  3��>��Ÿ�ο���1500�� 4��> ����");
			int menu = sc.nextInt();

			int aMoney = 0;

			switch (menu) {
			case 1:
				System.out.println("�ݶ� �����ϼ̽��ϴ�!");
				aMoney = money - 800;
				break;
			case 2:
				System.out.println("������ �����ϼ̽��ϴ�!");
				aMoney = money - 500;
				break;
			case 3:
				System.out.println("��Ÿ�ο��͸� �����ϼ̽��ϴ�!");
				aMoney = money - 1500;
				break;
			case 4:
				System.out.println("���α׷� ����");
				sw = false;
                break;
			default:
				System.out.println("�ٽ� �������ּ���");
				break;

			}
			if (aMoney < 0) {
				System.out.println("���� �����ؿ� �Ф� ");
			} else {
				System.out.println("�ܵ� : " + aMoney);
				System.out.println("õ�� : " + (aMoney / 1000));
				System.out.println("����� : " + (aMoney % 1000 / 500));
				System.out.println("��� : " + (aMoney % 1000 % 500 / 100));
				System.out.println("���ְ� �弼�� ^^");
			}

		}
	}

}
