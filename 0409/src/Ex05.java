import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 :");
		int num1 = sc.nextInt();
		System.out.print("수 입력 :");
		int num2 = sc.nextInt();
		
		int result = LargeNumbers(num1, num2);
		System.out.println("큰 수 확인 : "+ result);
	}
	
	public static int LargeNumbers(int sum1, int sum2) {
		int result =0;
		if(sum1>sum2) {
			result = sum1;
		}else if(sum2>sum1) {
			result = sum2;
		}else {
			result =0;
		}
		return result;   // return 값 
	}

}
