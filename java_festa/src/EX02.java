import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ : ");
		int num = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int num1 = sc.nextInt();
		int result = 0;
		int day = 1;
		while (true) {
			System.out.print(day+"���� ���� ������ : ");
			int m = sc.nextInt();
			
			num-= m;
			result = num;
			if(num<=num1) {
				System.out.println(result+"kg�޼�!! �����մϴ�.");
				break;
			}
			day++;
		}
	}

}
