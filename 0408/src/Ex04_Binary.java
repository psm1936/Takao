
public class Ex04_Binary {

	public static void main(String[] args) {
		// Binary search
		
				// ���� �Ǿ� �־�� ���� �ִ�.
				
				// (low + high) / 2   ã��������
				
				// low, high �� ����.
		
		int[] arr = {1,7,16,25,30,33,41,66,78,90};
		int search =78;
		
		int lowIndex =0;
		int highIndex = arr.length-1;
				
		while (true) {
			
			int midIndex = (lowIndex+highIndex)/2;
			if(search == arr[midIndex]) {
				System.out.println(arr[midIndex]+"��(��) "+midIndex+"���� �����Դϴ�.");
			    break; 
			}else if(search>arr[midIndex]) {
				lowIndex = midIndex+1;		
			}else if(search<arr[midIndex]) {
				highIndex = midIndex-1;
			}
		}
		
		
		
	}

}
