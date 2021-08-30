import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();	
		
		System.out.println("대시('-')의 총 합 >> "+sumNum(num));
		
		
		
	}
	public static int sumNum(int num) {
		int result =0;
		
		int[] dash = {6,2,5,5,4,5,6,3,7,6};    // 이 부분이 제일 중요
		while (num>0) {                        // 입력 한 num값이 0보다 작을떄까지 돌린다.
			int num2 = num%10;                 // num의 맨뒷자리수를 구한다.    
			num /=10;                          // num의 맨뒷자리수를 없앤다.
			result +=dash[num2];               // result에 num의 맨뒷자리수의 dash 수를 누적시킨다.      
		}
		return result;
	}

}
