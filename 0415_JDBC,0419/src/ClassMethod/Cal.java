package ClassMethod;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 더하기, 뺴기, 나누기, 곱하기

		System.out.println("정수 두개를 입력하세요");
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();

		System.out.println("1. 더하기  2. 뺴기    3. 나누기 4. 곱하기");
		int num3 = sc.nextInt();

		switch (num3) {
		case 1:
			Plus민호  p = new Plus민호();
			int result = p.plus(num1,num2);
			System.out.println(result);
			break;
		case 2:
			Min영주 m = new Min영주();
			result = m.min(num1, num2);
			System.out.println(result);
			break;

		default:
			break;
		}

	}

}
