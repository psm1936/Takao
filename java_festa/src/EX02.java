import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int num = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int num1 = sc.nextInt();
		int result = 0;
		int day = 1;
		while (true) {
			System.out.print(day+"주차 감량 몸무게 : ");
			int m = sc.nextInt();
			
			num-= m;
			result = num;
			if(num<=num1) {
				System.out.println(result+"kg달성!! 축하합니다.");
				break;
			}
			day++;
		}
	}

}
