import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		int num = sc.nextInt();
		System.out.print(num+" = ");

		for (int i = 2; i <= num/i; i++) {  // i�� ����ؼ� �����ϰ� num/i�� ������ ���Ϻ��� �۾����� ����.
			while (num % i == 0) {
				System.out.print(i);  // �ٷ� i�� ����ϸ鼭 ���ؼ��� �˷��ش�.
				num /= i;                   // 2�� ���� num��  num�ȿ� ���� �ִ´�. �׷��� ��� ���������ٰ� �ȳ���������.
			}			
		}
		
		if(num !=1) {                   //num ������ ���� 1�̸� ��� ��
			System.out.print(num);
		}
	}

}
