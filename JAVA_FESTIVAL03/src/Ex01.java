import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Çà °³¼ö : ");
		int num = sc.nextInt();
		
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num-j; i++) {
				System.out.print("*");
			}System.out.println("");
		}		
	}

}
