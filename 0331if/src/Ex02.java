import java.util.Scanner;

public class Ex02 {

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

	}

	}

	}


