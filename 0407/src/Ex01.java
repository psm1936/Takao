import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[5];
		int num =0;
		
		System.out.println("답을 입력하세요");
		for (int i = 0; i < input.length; i++) {
			System.out.print((i+1)+"번답 >>");
			 num=sc.nextInt();
			 input[i] = num;			 
		}
		System.out.print("입력한 답은 :");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		
		
	}

}
