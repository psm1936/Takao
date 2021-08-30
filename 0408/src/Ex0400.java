
public class Ex0400 {

	public static void main(String[] args) {
		int[] arr = {1,7,16,25,30,33,41,66,78,90};
		int search = 70;
		
		int high =arr.length-1;
		int low = 0;
		
		
		
		while (true) {
			int mid = (low+high)/2;
			
			if(search == arr[mid]) {
				System.out.println(" 찾음 ");
				break;
			}else if(search>arr[mid]) {
				low =mid +1;               // 이 부분 헷갈림 조심.				
			}else if(search<arr[mid]) {
				high = mid -1;
			}
			if(low>high) {
				System.out.println("발견 못했다 이놈아");
				break;
			}
		}
		
	}

}
