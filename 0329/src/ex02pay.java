import java.util.Scanner;

public class ex02pay {

	public static void main(String[] args) {
		
		System.out.println("--더치페이 계산기--");
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명인가요?");
		int human = sc.nextInt();
		System.out.println("총 금액은 얼마인가요?");
		int money = sc.nextInt();
		System.out.println("각 자 지불해야할 금액은"+(money/human)+"원입니다.");
		
		
		
	}

}
