import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
				
		// while�� 
		
		// for�� - ������ ��Ȯ�� �˶�.
		
		// do - while�� 
		
//		do {
//			�ݵ�� �ѹ��� ����Ǿ�� �ϴ� ����
//		} while (���ǽ�);
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("���� ������ : ");
		int weight1 = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int mWeight1 =sc.nextInt();
		
		int day = 1;
				
		do {
			System.out.print(day+"���� ���� ������ : ");
			int minus1 = sc.nextInt();
			day+=1;
			weight1-=minus1;  //����� ��.			
		} while (weight1>=mWeight1);  // ���ǽ� �� �´ٸ� ��� �ݺ��� ������� 
		System.out.println(weight1+"�޼�!! �����մϴ�!");
		
		
		

	}

}
