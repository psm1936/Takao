import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[5];
		int num =0;
		
		System.out.println("���� �Է��ϼ���");
		for (int i = 0; i < input.length; i++) {
			System.out.print((i+1)+"���� >>");
			 num=sc.nextInt();
			 input[i] = num;			 
		}
		System.out.print("�Է��� ���� :");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		
		
	}

}
