import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 =0;
		
		while (true) {
			System.out.print("A 입력 >> ");
			num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			num2 = sc.nextInt();		
			
			if(num1==0 && num2==0) {                          //두수가 0을 입력했을때 결과창을 출력하지 않는다.
				break;
			}else {
				System.out.print("결과 >> "+(num1-num2)+"\n");
			}
		} 



	}

}
