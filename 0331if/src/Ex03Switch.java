import java.util.Scanner;

public class Ex03Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		String sum = sc.next();        // ���� �Է� ���.
		
		System.out.println("ù ���� ���� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ���� ���� : ");
		int num2 = sc.nextInt();
		
				
		if(sum.equals("+")) {  //equals ���� ���Ҷ� ����Ѵ�.
			System.out.println(num1+ "��" +num2+"�� ����"+(num1 +num2)+"�Դϴ�.");
		}else if(sum.equals("-")) {
			System.out.println(num1+"��"+num2+"�� ����"+ (num1-num2) +"�Դϴ�.");
		}else if(sum.equals("*")) {
			System.out.println(num1+"��"+num2+"�� ����"+ (num1*num2) +"�Դϴ�.");
		}else {
			System.out.println(num1+"��"+num2+"�� ������"+ (num1/num2) +"�Դϴ�.");

		switch(sum) {
		case "+":
			System.out.println(num1 +num2);
		break;
		case "-":
			System.out.println(num1 -num2);
		break;
		case "*":
			System.out.println(num1 *num2);
		break;
		case "/":
			System.out.println(num1 /num2);
		break;
		
		}
			
//		
//		switch (num) {
//		case 1:
//			System.out.println("�Է��� ���� ���� 1�Դϴ�.");
//			break;
//		case 2:
//			System.out.println("�Է��� ���� ����2�Դϴ�.");
//			break;
//		default:
//			System.out.println("�Է��� ���� 1,2�� �ƴմϴ�.");
//			break;		
//		}
		// if���� switch �� ������
		// 1. if�� ���� ��� ���������� �ϳ��ϳ� �� (���� ����,)
		// 2. switch�� ������ ���� �ش� ���ǿ� ���๮ ����(����, 
		
	}

}
}
