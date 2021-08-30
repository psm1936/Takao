import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일할시간을 입력하세요 : ");
		int num = sc.nextInt();
		int result = 0;
		if(num>8) {
			result =(num-8)*7500 + 8*5000;
			System.out.print("총 임금은 "+result+"원 입니다.");
		}else {
			result =num*5000;
			System.out.print("총 임금은 "+result+"원 입니다.");
		}
		
		
		

	}

}
