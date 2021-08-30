
public class Ex04_Binary {

	public static void main(String[] args) {
		// Binary search
		
				// 정렬 되어 있어야 쓸수 있다.
				
				// (low + high) / 2   찾을때까지
				
				// low, high 의 변동.
		
		int[] arr = {1,7,16,25,30,33,41,66,78,90};
		int search =78;
		
		int lowIndex =0;
		int highIndex = arr.length-1;
				
		while (true) {
			
			int midIndex = (lowIndex+highIndex)/2;
			if(search == arr[midIndex]) {
				System.out.println(arr[midIndex]+"은(는) "+midIndex+"번쨰 숫자입니다.");
			    break; 
			}else if(search>arr[midIndex]) {
				lowIndex = midIndex+1;		
			}else if(search<arr[midIndex]) {
				highIndex = midIndex-1;
			}
		}
		
		
		
	}

}
