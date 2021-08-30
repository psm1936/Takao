import java.util.Arrays;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1+"번째 수 입력 : ");
			int num = sc.nextInt();
			
			a[i]= num;		
		}
		for (int k = 0; k < a.length-1; k++) {

			for (int i = 0; i < a.length-1-k; i++) {
				if(a[i]>a[i+1]) {
					int temp = a[i];
					a[i] =a[i+1];
					a[i+1] =temp;					
				}				
			}			
		}		
		System.out.println("정렬 후");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
