import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 =0;
		
		while (true) {
			System.out.print("A �Է� >> ");
			num1 = sc.nextInt();
			System.out.print("B �Է� >> ");
			num2 = sc.nextInt();		
			
			if(num1==0 && num2==0) {                          //�μ��� 0�� �Է������� ���â�� ������� �ʴ´�.
				break;
			}else {
				System.out.print("��� >> "+(num1-num2)+"\n");
			}
		} 



	}

}
