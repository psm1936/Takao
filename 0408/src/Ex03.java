
public class Ex03 {

	public static void main(String[] args) {
		
		// �˻� �˰���.
		// 1. Sequential search
		// �迭�� ����� ��ȿ����
		
		int[] arr= {13,35,15,11,26,72,78,13,61,90};
//		int num =0;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		for (int i = 0; i < arr.length; i++) {
//						
//			if(arr[i]==78) {
//				num=i;
//				System.out.println("\n"+arr[i]+"��(��) "+num+"���� �����Դϴ�.");
//				break;
//			}
//		}
		
		int search =78;
		for (int i = 0; i < arr.length; i++) {
			if(search == arr[i]) {
				System.out.println(search+"�� "+i+"���� ���� �Դϴ�.");
				break;
			}
		}
		
		
		
	}

}
