
public class Ex03 {

	public static void main(String[] args) {
		
		// 검색 알고리즘.
		// 1. Sequential search
		// 배열이 길수록 비효율적
		
		int[] arr= {13,35,15,11,26,72,78,13,61,90};
//		int num =0;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		for (int i = 0; i < arr.length; i++) {
//						
//			if(arr[i]==78) {
//				num=i;
//				System.out.println("\n"+arr[i]+"은(는) "+num+"번쨰 숫자입니다.");
//				break;
//			}
//		}
		
		int search =78;
		for (int i = 0; i < arr.length; i++) {
			if(search == arr[i]) {
				System.out.println(search+"는 "+i+"번쨰 숫자 입니다.");
				break;
			}
		}
		
		
		
	}

}
