import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		
		// ���� ����
		// ���� ū ���� ã�Ƽ� 0������ �̵�
		
		
		int[] arr = {7,98,13,70,24};
		
		for (int j = 0; j < arr.length; j++) {
			
			int maxIndex = j;         // index ��ȣ�� ������.
			// ���� ū���� �ε����� ã�� ���
			for (int i = j+1; i < arr.length; i++) { 
				if(arr[maxIndex]<arr[i]) {
					maxIndex = i; //���� ū���� index ��ȣ�� �־���.
				}			
				
			}
			int temp = arr[j];
			arr[j] = arr[maxIndex];  // ���� ū���� ��ȣ�� �̷��� �־��ش�.
			arr[maxIndex] = temp;
			System.out.println(Arrays.toString(arr));  // ��¹�
		}		
		
	}

}
