import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Á¤¼ö n : ");
		int num = sc.nextInt();
		
		int[][] range = new int[num][num];
		
		for (int i = 0; i < range.length; i++) {
			int start = i+1;
			for (int j = 0; j < range.length; j++) {
				range[i][j] = start;
				start+=5;
				System.out.print(range[i][j]+"\t");
			}
			System.out.println("");
		}
		

	}

}
