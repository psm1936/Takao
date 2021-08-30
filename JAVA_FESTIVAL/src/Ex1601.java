import java.util.Scanner;

public class Ex1601 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] range = new int[num][num];
		
		int start = 1;
		int st = 0;
		
		for (int i = 0; i < range.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < range.length; j++) {
					range[i][j] = start;
					start++;
				}
			}else {
				for (int j = 4; j >= 0; j--) {
					range[i][j]= start;
					start++;
				}
			}
		}
		for (int i = 0; i < range.length; i++) {
			for (int j = 0; j < range.length; j++) {
				System.out.print(range[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
