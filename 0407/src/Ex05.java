
public class Ex05 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
	
		System.out.print("array�� ����ִ� Ȧ���� : ");
		int num =0;
		for (int arr : array) {
		
			if(arr%2==1) {
				System.out.print(arr+" ");				
				num++;
			}
		}		
		System.out.print("�̸�,\n��"+num+"�� �Դϴ�.");
		
	}

}
