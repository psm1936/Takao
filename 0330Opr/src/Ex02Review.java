import java.util.Scanner;

public class Ex02Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Java���� �Է�:");
		int javaScore = sc.nextInt();
		
		System.out.print("Web ���� �Է�:");
		int webScore = sc.nextInt();
		
		System.out.print("Android ���� �Է�:");
		int androidScore = sc.nextInt();
		
		int sum = (javaScore+webScore+androidScore);
		int avg = (sum/3);
			
		
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);

	}

}
