import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5���� ������ �����͸� ���� �� �ִ� �迭 ����
		
		int[] scoreArr = new int[5];
//		System.out.print("1��° �Է�>> ");
//		scoreArr[0]=sc.nextInt();
//		System.out.print("2��° �Է�>> ");
//		scoreArr[1]=sc.nextInt();
//		System.out.print("3��° �Է�>> ");
//		scoreArr[2]=sc.nextInt();
//		System.out.print("4��° �Է�>> ");
//		scoreArr[3]=sc.nextInt();
//		System.out.print("5��° �Է�>> ");
//		scoreArr[4]=sc.nextInt();		
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print((i+1)+"��° �Է�>> ");
			scoreArr[i]=sc.nextInt();		
		}
		
		System.out.print("�Էµ� ����: ");
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i]+" ");
		}
		
		

	}

}
