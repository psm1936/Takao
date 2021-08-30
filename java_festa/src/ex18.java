import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int num2 = sc.nextInt();
			int result = 0;
			result = num1 - num2;
			if(num1 ==0 && num2 == 0) {				
				break;
			}else {
				System.out.println("결과 >> "+result);
			}
			
			
			
		}

	}

}
