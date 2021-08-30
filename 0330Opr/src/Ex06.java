import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 삼항 연산자 : 입력식이 True , False에 따라서 간단한 제어처리
		
		// (조건문)?(실행문1):(실행문2)  조건문이 참이면 실행문1, 거짓이면 실행문2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번쨰 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int minus =num1>num2?num1-num2:num2-num1;
		System.out.print("두 수의 차 : "+minus);
		
		
	}

}
