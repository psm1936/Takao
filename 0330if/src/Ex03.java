import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int num1 = sc.nextInt();		
		System.out.print("전자계산기 구조 : ");
		int num2 = sc.nextInt();
		System.out.print("OS : ");
		int num3 = sc.nextInt();
		System.out.print("데이터통신 : ");
		int num4 = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int num5 = sc.nextInt();
		int sum = num1+num2+num3+num4+num5;
		
//		if(num1<8 || num2<8 || num3<8 || num4<8 || num5<8) {
//			System.out.println("불합격입니다!");
//		}else if(sum<60) {
//			System.out.println("불합격입니다!");
//		}else {
//			System.out.println("합격입니다!");		   
		
		if((num1<8 || num2<8 || num3<8 || num4<8 || num5<8) || sum<60) {
			System.out.println("불합격입니다!");
		}else {
			System.out.println("합격입니다!");		   
		}
		
		// 거스름돈 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하시오.
		// 단 최대단위는 10000원, 최소단위는 100원
		
		System.out.print("총금액 입력 : ");
		int max = sc.nextInt();
		
		int sum1 = max/10000;
		int sum2 = max%10000/5000;
		int sum3 = max%10000%5000/1000;
		int sum4 = max%10000%5000%1000/500;
		int sum5 = max%10000%5000%1000%500/100;
		
		System.out.println("잔돈 : "+ max+"원");
		System.out.println("10000원 : "+sum1+"개");
		System.out.println("5000원 : "+sum2+"개");
		System.out.println("1000원 : "+sum3+"개");
		System.out.println("500원 : "+sum4+"개");
		System.out.println("100원 : "+sum5+"개");

	}

}
