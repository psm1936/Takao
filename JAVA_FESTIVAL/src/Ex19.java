import java.util.Arrays;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int num =0;
		for (int i = 0; i < 5; i++) {               //�ϴ� �迭�� ���� �Է¹޴´�.
			System.out.print((i+1)+"���� �� �Է� : ");
			num = sc.nextInt();
			arr[i] =num;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;       // 0�������� ���ϱ����ؼ�
			
			for (int j = i+1; j < arr.length; j++) {   //1��°�� ���ϱ����� i+1
				if(arr[minIndex]>arr[j]) {   //������ �־��ֱ� ���� ��
					minIndex =j;             //�ε��� �� �������� �־��ش�.
			}				
		 } 
			int temp = arr[i];               //ù��° �񱳰��� �־��ְ�. arr[0]
			arr[i] = arr[minIndex];          //arr[0] ��  minIndex ������ ���� �־���
			arr[minIndex] =temp;             //�ι��� �� ���� �־��ش�. 
			

		}
		System.out.println("���� ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

//		int[] arr = { 7, 98, 13, 70, 24 };
//
//		for (int j = 0; j < arr.length; j++) {
//
//			int maxIndex = j; // index ��ȣ�� ������.
//			// ���� ū���� �ε����� ã�� ���
//			for (int i = j + 1; i < arr.length; i++) {
//				if (arr[maxIndex] < arr[i]) {
//					maxIndex = i; // ���� ū���� index ��ȣ�� �־���.
//				}
//
//			}
//			int temp = arr[j];
//			arr[j] = arr[maxIndex]; // ���� ū���� ��ȣ�� �̷��� �־��ش�.
//			arr[maxIndex] = temp;
//			System.out.println(Arrays.toString(arr)); // ��¹�
//		}
	}

}
