import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
//		
//		for (int i = 3; i <= 100; i+=3) {
//			sum+=i;
//		}
//		System.out.println("3�� ����� �� : "+sum);

//		
//		for(int i =1; i<=100; i++ ) {
//			if(i%3 == 0) {
//				sum +=i;
//			}
//		}System.out.println("3�� ����� �� : "+sum);

//		int dan = 2;
//		
//		for(int i = 1; i<10; i++) {
//			System.out.println(dan + "*" + i + "=" + (dan*i));
//		}

//		System.out.print("�� �Է� : ");
//		int dan = sc.nextInt();
//		
//		System.out.print("���� �Է� : ");
//		int bom = sc.nextInt();
//		
//		for(int i =1; i<=bom;i ++ ) {
//			
//			System.out.println(dan+"*"+i+"="+dan*i);
//		}

		// 2�ܺ��� 9�ܱ���.
		
   
		for (int dan = 1; dan <= 9; dan++) {
			
			for (int range = 2; range <= 9; range++) {

				System.out.print(range + "*" + dan + "=" + dan * range+"\t");
			}
			
			System.out.println("");
		}
//		int dan = 2;
//		int i = 1;
//		for (int range = 1; range <= 9; range++) {
//			System.out.print(dan + "�� :");
//			for (; dan <= 9; dan++) {
//				System.out.print(dan + "*" + range + "=" + dan * range + " ");
//
//			}
//			System.out.println("");
//		}

	}

}
