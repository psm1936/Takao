import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// �ݺ���
		// for, while, do while
		
		// while  ���ѹݺ� �Ҷ�. �ݺ� Ƚ���� �𸦶�
		
		// for  �ݺ�Ƚ���� �˶�
		
		// do while 
		
		// ���տ� ������ ��
		int sum =0;
		// ����
		int num =0;
	
		while (num<=1000) {		//�ݺ��� �� ���� : ex)1000�� �Ѿ�� ����������.
			num +=sum;
			sum+=1;
		}
		System.out.println( "1���� " +(sum-1)+"���� �� ��: "+num);
		
//		//����
//		int sum =0;
//		//���տ� ������ ��
//		int num =0;
//		
//		while (true) {   //�ݺ��� �� ����
//			sum = sum+num; //����
//			
//			if(sum>1000) {
//				break;
//			}
//			num++;    // ��ġ �Ű�
//			
//		}
//		System.out.printf("1���� %d���� �� �� : %d",num,sum);
		
		
		
	}

}
