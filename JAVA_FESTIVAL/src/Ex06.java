import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		if (num % 10 >= 0.5) {
			System.out.println("반올림 수 : " + ((num / 10) * 10 + 10));
		} else {
			System.out.println("반올림 수 : " + ((num / 10) * 10));
		}
	}

}
