import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String y ="";  // �ٱ��� ���ְ�  ���� �־��ش�.
				
		do {
			System.out.print("ù ��° ������ �Է��ϼ��� >> ");
			int num1 = sc.nextInt();
			System.out.print("�� ��° ������ �Է��ϼ��� >> ");
			int num2 = sc.nextInt();
			System.out.print("[1]���ϱ�  [2]����  >> ");
			int num3 = sc.nextInt();
			
			if(num3 ==1) {
				System.out.println("���ϱ� ���� �����"+(num1 +num2)+"�Դϴ�.");
			}else {
				System.out.println("���� ���� �����"+(num1 -num2)+"�Դϴ�.");
			}			
			
			System.out.print("�ٽ� �����Ͻðڽ��ϱ�? (Y/N) >> ");
			 y = sc.next();
			
		} while (y.equals("Y"));
		System.out.println("����Ǿ����ϴ�.");
		
				
	}

}
