
public class Ex05 {

	public static void main(String[] args) {
		int[] arr = {2,7,0,3,8,9,15,72,4,27};
		
		int max =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max =arr[i];
			}
		}
		System.out.println(max);
		
//		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if(max< arr[i]) {
//				max=arr[i];
//			}
//		}System.out.println(max);
		
		
		// ���� �� ã��
		
		int min =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min =arr[i];
			}
		}
		System.out.println("���� ���� ���� "+min+"�Դϴ�.");
		
		
	}

}
