
public class Ex0400 {

	public static void main(String[] args) {
		int[] arr = {1,7,16,25,30,33,41,66,78,90};
		int search = 70;
		
		int high =arr.length-1;
		int low = 0;
		
		
		
		while (true) {
			int mid = (low+high)/2;
			
			if(search == arr[mid]) {
				System.out.println(" ã�� ");
				break;
			}else if(search>arr[mid]) {
				low =mid +1;               // �� �κ� �򰥸� ����.				
			}else if(search<arr[mid]) {
				high = mid -1;
			}
			if(low>high) {
				System.out.println("�߰� ���ߴ� �̳��");
				break;
			}
		}
		
	}

}
