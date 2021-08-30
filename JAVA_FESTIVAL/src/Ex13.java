import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[][] n = new int[num1][num1];
		
		int num =1;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j]= num;
				num++;
				System.out.print(n[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}
