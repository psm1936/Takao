import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// for문

		int num1 = 0;
		int h = 0;
		int j = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("정수 입력:");
			num1 = sc.nextInt();

			if (num1 % 2 == 0) {
				j += 1;
			} else {
				h += 1;
			}
			System.out.println("홀수 개수 : " + h);
			System.out.println("짝수 개수 : " + j);
		}
		
		
		
		

	}

}
