import java.util.Scanner;

public class ex02pay {

	public static void main(String[] args) {
		
		System.out.println("--��ġ���� ����--");
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���ΰ���?");
		int human = sc.nextInt();
		System.out.println("�� �ݾ��� ���ΰ���?");
		int money = sc.nextInt();
		System.out.println("�� �� �����ؾ��� �ݾ���"+(money/human)+"���Դϴ�.");
		
		
		
	}

}
