import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// ���� ������ : �Է½��� True , False�� ���� ������ ����ó��
		
		// (���ǹ�)?(���๮1):(���๮2)  ���ǹ��� ���̸� ���๮1, �����̸� ���๮2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù���� ���� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι��� ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int minus =num1>num2?num1-num2:num2-num1;
		System.out.print("�� ���� �� : "+minus);
		
		
	}

}
