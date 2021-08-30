import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int maxM = sc.nextInt();
		System.out.println("");		
		
		int num1 = maxM/10000;
		int num2 = maxM%10000/5000;
		int num3 = maxM%10000%5000/1000;
		int num4 = maxM%10000%5000%1000/500;
		int num5 = maxM%10000%5000%1000%500/100;
		
		System.out.println("잔돈 : "+maxM+"개");
		System.out.println("10000원 : "+num1+"개");
		System.out.println("5000원 : "+num2+"개");
		System.out.println("1000원 : "+num3+"개");
		System.out.println("500원 : "+num4+"개");
		System.out.println("100원 : "+num5+"개");
		
		

	}

}
