import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// �ݺ���
		
		// 1. ������ �ݺ� (�迭, ����Ʈ ��) for
		// 2. Ư�� �������� �ݺ�(���� �ݺ�)  while
		
		// ��ü ����
		// ctrl + a
		// �ڵ� ����  
		// ctrl + shift +f
	
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			// while :���ǽ� true������ �ݺ�
			// ����ڿ��� 0�̶�� ���� �Է� �޾����� ����
			int num = sc.nextInt();
			System.out.println("����ڰ� �Է��� �� : "+ num);
			
			if(num==0) {
				System.out.println("���α׷�����");
				break;
			}
		}
		
	}

}
