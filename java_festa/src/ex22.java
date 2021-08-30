import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] range = new int[5][5];
		int start =1;
		for (int i = 0; i < range.length; i++) {
			for (int j = 0; j < range[i].length; j++) {
				range[i][j] = start;
				start++;
				System.out.print(range[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("90µµ È¸Àü");
		for (int i = 0; i < range.length; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(range[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
