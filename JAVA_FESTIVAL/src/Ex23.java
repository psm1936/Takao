import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		int num = sc.nextInt();	
		
		System.out.println("���('-')�� �� �� >> "+sumNum(num));
		
		
		
	}
	public static int sumNum(int num) {
		int result =0;
		
		int[] dash = {6,2,5,5,4,5,6,3,7,6};    // �� �κ��� ���� �߿�
		while (num>0) {                        // �Է� �� num���� 0���� ���������� ������.
			int num2 = num%10;                 // num�� �ǵ��ڸ����� ���Ѵ�.    
			num /=10;                          // num�� �ǵ��ڸ����� ���ش�.
			result +=dash[num2];               // result�� num�� �ǵ��ڸ����� dash ���� ������Ų��.      
		}
		return result;
	}

}
