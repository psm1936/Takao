import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ҽð��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int result = 0;
		if(num>8) {
			result =(num-8)*7500 + 8*5000;
			System.out.print("�� �ӱ��� "+result+"�� �Դϴ�.");
		}else {
			result =num*5000;
			System.out.print("�� �ӱ��� "+result+"�� �Դϴ�.");
		}
		
		
		

	}

}
