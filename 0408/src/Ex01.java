import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		// 정렬 알고리즘
		
		//원소들을 일정한 순서대로 정렬하는 알고리즘.
		
		// 버블정렬 , 선택정렬
		
		// Bubble sort
		// 두 인접한 원소를 비교 정렬하는방법, 속도는 느림, 코드 단순
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
