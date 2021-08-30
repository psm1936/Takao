import java.util.Scanner;

public class exexexexe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("숫자 2 입력 >> ");
		int num2 = sc.nextInt();
		
		int num3 =0;
		int num4 =0;
		for (int i = 1; i <= num1; i++) {
			if(num1%i ==0 && num2%i ==0) {
				num3 = i;
			}
		}
		
		System.out.println(num3);
		System.out.println(num1*num2/num3);
		
		

	}

}
