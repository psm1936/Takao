import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		// ���� �˰���
		
		//���ҵ��� ������ ������� �����ϴ� �˰���.
		
		// �������� , ��������
		
		// Bubble sort
		// �� ������ ���Ҹ� �� �����ϴ¹��, �ӵ��� ����, �ڵ� �ܼ�
		int[] arr = {5,4,3,2,1};
		
		System.out.println(Arrays.toString(arr));
		
		// 1step 0>1 1>2 2>3 3>4
		
		for (int k = 0; k < arr.length-1; k++) {

			for (int i = 0; i < arr.length-1-k; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			
		}
		
		
		
	}

}
