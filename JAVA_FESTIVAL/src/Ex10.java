import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		int i =0;
		int[] b =new int[32];
		System.out.println("�����Է� >>");
		num = sc.nextInt();
		
		while (num !=1) {
			b[i++] = num%2;
			num = num/2;
		}
		b[i] =num;   //���� �������� ���������� ������ ������ ���� �迭�� �־�д�.
		
		for (int j = i; j >= 0; --j) {
			System.out.print(b[j]+" ");
		}
	}

}
