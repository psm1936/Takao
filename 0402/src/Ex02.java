import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		for(int i =1; i<=a; i++) {
//		System.out.print(i+" ");
//	}

//		System.out.print("ù ��°�� �Է� : ");
//		int a = sc.nextInt();                   //ù ��° ��
//		System.out.print("�� ������ �Է� : ");
//		int b = sc.nextInt();                   //�� ���� ��
		
//		int num = 0;
//		int sNum = 0;
//
//		if (a <= 100 && b <= 100) {
//			if (a > b) {
//				num = a;
//				sNum = b;
//			} else {
//				num = b;
//				sNum = a;
//			}
//			for (int i = sNum; i <= num; i++) {
//				System.out.println(" " + i);
//			}
//		} else {
//			System.out.println("100 ���ϸ� Ŀ��!");
//		}
		
		int num1 = sc.nextInt();                  
		int num2 = sc.nextInt();                  
		
//		if(num1<num2) {
//			for(int i = num1; i<=num2; i++) {
//				System.out.println(i+" ");
//			}
//		}else if(num1>num2) {
//			for(int i = num2; i<=num1; i++) {
//				System.out.println(i+" ");
//			}
//		}
		
		if(num2<num1) {
			int temp = num1;
			num1=num2;
			num2=temp;
		}
		for(int i = num1; i<=num2; i++) {
			System.out.println(i+" ");
		}
		

	}

}
