import java.util.Scanner;

public class Ex0400 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ѱݾ� �Է� :");
		int m = sc.nextInt();
		
		int num1 = m/10000;
		int num2 = m%10000/5000;
		int num3 = m%10000%5000/1000;
		int num4 = m%10000%5000%1000/500;
		int num5 = m%10000%5000%1000%500/100;
		
		System.out.println("�ܵ� : "+m+"��");
		System.out.println("10000�� : "+num1+"��");
		System.out.println("5000�� : "+num2+"��");
		System.out.println("1000�� : "+num3+"��");
		System.out.println("500�� : "+num4+"��");
		System.out.println("100�� : "+num5+"��");
		
	}

}
