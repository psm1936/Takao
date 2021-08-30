import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();
		System.out.print(num+" = ");

		for (int i = 2; i <= num/i; i++) {  // i는 계속해서 증가하고 num/i로 나눈수 이하보다 작아지면 멈춤.
			while (num % i == 0) {
				System.out.print(i);  // 바로 i를 출력하면서 분해수를 알려준다.
				num /= i;                   // 2로 나눈 num을  num안에 집어 넣는다. 그러면 계속 나누어지다가 안나누어진다.
			}			
		}
		
		if(num !=1) {                   //num 마지막 값이 1이면 출력 ㄴ
			System.out.print(num);
		}
	}

}
