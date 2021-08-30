import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		
		// 선택 정렬
		// 가장 큰 수를 찾아서 0번쨰로 이동
		
		
		int[] arr = {7,98,13,70,24};
		
		for (int j = 0; j < arr.length; j++) {
			
			int maxIndex = j;         // index 번호를 저장함.
			// 가장 큰수의 인덱스를 찾는 방법
			for (int i = j+1; i < arr.length; i++) { 
				if(arr[maxIndex]<arr[i]) {
					maxIndex = i; //가장 큰수의 index 번호를 넣어줌.
				}			
				
			}
			int temp = arr[j];
			arr[j] = arr[maxIndex];  // 가장 큰수의 번호를 이렇게 넣어준다.
			arr[maxIndex] = temp;
			System.out.println(Arrays.toString(arr));  // 출력문
		}		
		
	}

}
