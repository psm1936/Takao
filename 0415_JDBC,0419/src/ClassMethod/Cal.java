package ClassMethod;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ���ϱ�, ����, ������, ���ϱ�

		System.out.println("���� �ΰ��� �Է��ϼ���");
		System.out.println("����1 : ");
		int num1 = sc.nextInt();
		System.out.println("����2 : ");
		int num2 = sc.nextInt();

		System.out.println("1. ���ϱ�  2. ����    3. ������ 4. ���ϱ�");
		int num3 = sc.nextInt();

		switch (num3) {
		case 1:
			Plus��ȣ  p = new Plus��ȣ();
			int result = p.plus(num1,num2);
			System.out.println(result);
			break;
		case 2:
			Min���� m = new Min����();
			result = m.min(num1, num2);
			System.out.println(result);
			break;

		default:
			break;
		}

	}

}
