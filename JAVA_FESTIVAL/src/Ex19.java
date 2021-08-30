import java.util.Arrays;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int num =0;
		for (int i = 0; i < 5; i++) {               //일단 배열을 전부 입력받는다.
			System.out.print((i+1)+"번쨰 수 입력 : ");
			num = sc.nextInt();
			arr[i] =num;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;       // 0번쨰부터 비교하기위해서
			
			for (int j = i+1; j < arr.length; j++) {   //1번째로 비교하기위해 i+1
				if(arr[minIndex]>arr[j]) {   //작은걸 넣어주기 위해 비교
					minIndex =j;             //인덱스 값 작은것을 넣어준다.
			}				
		 } 
			int temp = arr[i];               //첫번째 비교값을 넣어주고. arr[0]
			arr[i] = arr[minIndex];          //arr[0] 에  minIndex 작은거 값을 넣어줌
			arr[minIndex] =temp;             //두번쨰 비교 값에 넣어준다. 
			

		}
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

//		int[] arr = { 7, 98, 13, 70, 24 };
//
//		for (int j = 0; j < arr.length; j++) {
//
//			int maxIndex = j; // index 번호를 저장함.
//			// 가장 큰수의 인덱스를 찾는 방법
//			for (int i = j + 1; i < arr.length; i++) {
//				if (arr[maxIndex] < arr[i]) {
//					maxIndex = i; // 가장 큰수의 index 번호를 넣어줌.
//				}
//
//			}
//			int temp = arr[j];
//			arr[j] = arr[maxIndex]; // 가장 큰수의 번호를 이렇게 넣어준다.
//			arr[maxIndex] = temp;
//			System.out.println(Arrays.toString(arr)); // 출력문
//		}
	}

}
