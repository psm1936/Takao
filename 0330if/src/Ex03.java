import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int num1 = sc.nextInt();		
		System.out.print("���ڰ��� ���� : ");
		int num2 = sc.nextInt();
		System.out.print("OS : ");
		int num3 = sc.nextInt();
		System.out.print("��������� : ");
		int num4 = sc.nextInt();
		System.out.print("����Ʈ������� : ");
		int num5 = sc.nextInt();
		int sum = num1+num2+num3+num4+num5;
		
//		if(num1<8 || num2<8 || num3<8 || num4<8 || num5<8) {
//			System.out.println("���հ��Դϴ�!");
//		}else if(sum<60) {
//			System.out.println("���հ��Դϴ�!");
//		}else {
//			System.out.println("�հ��Դϴ�!");		   
		
		if((num1<8 || num2<8 || num3<8 || num4<8 || num5<8) || sum<60) {
			System.out.println("���հ��Դϴ�!");
		}else {
			System.out.println("�հ��Դϴ�!");		   
		}
		
		// �Ž����� �Է� �޾� ������� �ϴ� ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �� �ִ������ 10000��, �ּҴ����� 100��
		
		System.out.print("�ѱݾ� �Է� : ");
		int max = sc.nextInt();
		
		int sum1 = max/10000;
		int sum2 = max%10000/5000;
		int sum3 = max%10000%5000/1000;
		int sum4 = max%10000%5000%1000/500;
		int sum5 = max%10000%5000%1000%500/100;
		
		System.out.println("�ܵ� : "+ max+"��");
		System.out.println("10000�� : "+sum1+"��");
		System.out.println("5000�� : "+sum2+"��");
		System.out.println("1000�� : "+sum3+"��");
		System.out.println("500�� : "+sum4+"��");
		System.out.println("100�� : "+sum5+"��");

	}

}
