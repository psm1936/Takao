import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String y ="";  // 바깥에 뺴주고  값을 넣어준다.
				
		do {
			System.out.print("첫 번째 정수를 입력하세요 >> ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수를 입력하세요 >> ");
			int num2 = sc.nextInt();
			System.out.print("[1]더하기  [2]빼기  >> ");
			int num3 = sc.nextInt();
			
			if(num3 ==1) {
				System.out.println("더하기 연산 결과는"+(num1 +num2)+"입니다.");
			}else {
				System.out.println("빼기 연산 결과는"+(num1 -num2)+"입니다.");
			}			
			
			System.out.print("다시 실행하시겠습니까? (Y/N) >> ");
			 y = sc.next();
			
		} while (y.equals("Y"));
		System.out.println("종료되었습니다.");
		
				
	}

}
