import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력하세요 : ");
		int time = sc.nextInt();
		int mm =0;
		
		if(time>8) {
			mm = (time-8)*7500+40000;
			System.out.println("총 임금은" + mm +"원 입니다.");
		}else {
			mm=time*5000;
			System.out.println("총 임금은" + mm +"원 입니다.");
		}

	}

}
