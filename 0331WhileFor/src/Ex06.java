import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���� �Ѱ�
		
//		int maxNum=0;
//		int gNum =0;
//		while(true) {
//			System.out.println("���ڸ� �Է��ϼ���");
//			int num =sc.nextInt();		
//			
//			if(num>=0 && num<=100) {
//				maxNum +=num;
//				gNum+=1;
//			}else {
//				break;
//			}
//		}
//		System.out.println("�հ� : "+maxNum);
//		System.out.println("��� : "+((float)maxNum/(float)gNum));
		
		
		// ���ľ���
		
//		int num1 = 0;
//		int time = 0;
//		while (true) {
//			System.out.println("���ڸ� �Է��ϼ���");
//			int num = sc.nextInt();
//			if (num < 0 || num > 100) {
//				break;
//			}
//
//			num1 += num;
//			time++;
//		}
//		System.out.println("�հ� : " + num1);
//		System.out.println("��� : " + (float) num1 / time);
		
//		int maxNum=0;
//		int gNum =0;
//		int num =0;
//		do {
//			System.out.println("���ڸ� �Է��ϼ���");
//			num =sc.nextInt();
//			if(num>=0 && num<=100) {
//				maxNum +=num;
//				gNum +=1;
//			}			
//			
//		} while (num>=0 && num<=100);			
//		System.out.println("�հ� : "+maxNum);
//		System.out.println("��� : "+(float)maxNum/gNum);
		
		//����Բ�
//		int num =0;
		int sum = 0;
		int cnt = 0;
		
		// do while��
		
//		do {
//			System.out.print("���ڸ� �Է��ϼ��� >>");
//			num = sc.nextInt();			
//			if(num>=0 && num<=100) {
//				sum +=num; //sum = sum + num
//				cnt++;     //cnt+=1
//			}
//		} while (num>=0 && num<=100);
//		System.out.println("�հ� : "+ sum);
//		System.out.println("��� : "+ (float)sum/cnt);
		
		
		//while �� 
		
//	    while(num>=0 && num<=100) {
//	    	System.out.print("���ڸ� �Է��ϼ��� >>");
//			num = sc.nextInt();			
//			if(num>=0 && num<=100) {
//				sum +=num; //sum = sum + num
//				cnt++;     //cnt+=1
//	      }
		
		//���� �ݺ���
						
		while(true) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();			
			
			if(num<0 || num>100) {  // �� ���ǿ� �����ϸ� break�ؼ�  �Ʒ��� �������°��� ���´�.			
				break;
			}
			sum+=num;  // �Ʒ��� ������ ������ �ɷ��� �Ʒ��� �������� ������ �ɷ�����.
			cnt++;
		}
		System.out.println("�հ� : "+ sum);
		System.out.println("��� : "+ (float)sum/cnt);	
	    
	}

}
