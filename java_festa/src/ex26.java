import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[][] range = new int[num][num];

		for (int i = 0; i < num; i++) {
			int start = 25 - i;
			for (int j = 0; j < num; j++) {
				range[i][j] = start;
				start -= 5;
				System.out.print(range[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}
