
public class Ex05 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
	
		System.out.print("array에 들어있는 홀수는 : ");
		int num =0;
		for (int arr : array) {
		
			if(arr%2==1) {
				System.out.print(arr+" ");				
				num++;
			}
		}		
		System.out.print("이며,\n총"+num+"개 입니다.");
		
	}

}
