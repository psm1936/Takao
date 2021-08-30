import java.util.Scanner;

public class Ex1900 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];


		for (int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"번째 수 입력 : ");
			num[i] = sc.nextInt();
		}
		
		for (int j = 0; j < num.length; j++) {
			int min =j;
			for (int i = j+1; i < num.length; i++) {
				if(num[min]>num[i]) {
					min=i;
				}				
			}
			int temp = num[j];
			num[j]= num[min];
			num[min]=temp;
		}
		
		System.out.println("정렬 후");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}

	}

}
