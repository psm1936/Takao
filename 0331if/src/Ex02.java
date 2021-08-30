import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산을 입력하세요 : ");
		String sum = sc.next();        // 문자 입력 방식.
		
		System.out.println("첫 번쨰 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번쨰 정수 : ");
		int num2 = sc.nextInt();
		
		if(sum.equals("+")) {  //equals 문자 비교할때 써야한다.
			System.out.println(num1+ "과" +num2+"의 합은"+(num1 +num2)+"입니다.");
		}else if(sum.equals("-")) {
			System.out.println(num1+"과"+num2+"의 뺌은"+ (num1-num2) +"입니다.");
		}else if(sum.equals("*")) {
			System.out.println(num1+"과"+num2+"의 곱은"+ (num1*num2) +"입니다.");
		}else {
			System.out.println(num1+"과"+num2+"의 나눔은"+ (num1/num2) +"입니다.");

	}

	}

	}


