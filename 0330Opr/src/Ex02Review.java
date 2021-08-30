import java.util.Scanner;

public class Ex02Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Java점수 입력:");
		int javaScore = sc.nextInt();
		
		System.out.print("Web 점수 입력:");
		int webScore = sc.nextInt();
		
		System.out.print("Android 점수 입력:");
		int androidScore = sc.nextInt();
		
		int sum = (javaScore+webScore+androidScore);
		int avg = (sum/3);
			
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);

	}

}
