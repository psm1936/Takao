import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ѱݾ� �Է� : ");
		int maxM = sc.nextInt();
		System.out.println("");		
		
		int num1 = maxM/10000;
		int num2 = maxM%10000/5000;
		int num3 = maxM%10000%5000/1000;
		int num4 = maxM%10000%5000%1000/500;
		int num5 = maxM%10000%5000%1000%500/100;
		
		System.out.println("�ܵ� : "+maxM+"��");
		System.out.println("10000�� : "+num1+"��");
		System.out.println("5000�� : "+num2+"��");
		System.out.println("1000�� : "+num3+"��");
		System.out.println("500�� : "+num4+"��");
		System.out.println("100�� : "+num5+"��");
		
		

	}

}
