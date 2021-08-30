import java.util.Scanner;

public class Ex03Switch {

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

		switch(sum) {
		case "+":
			System.out.println(num1 +num2);
		break;
		case "-":
			System.out.println(num1 -num2);
		break;
		case "*":
			System.out.println(num1 *num2);
		break;
		case "/":
			System.out.println(num1 /num2);
		break;
		
		}
			
//		
//		switch (num) {
//		case 1:
//			System.out.println("입력한 값은 숫자 1입니다.");
//			break;
//		case 2:
//			System.out.println("입력한 값은 숫자2입니다.");
//			break;
//		default:
//			System.out.println("입력한 값은 1,2가 아닙니다.");
//			break;		
//		}
		// if문과 switch 의 차이점
		// 1. if문 같은 경우 순차적으로 하나하나 비교 (범위 지정,)
		// 2. switch문 조건을 보고 해당 조건에 실행문 진입(선택, 
		
	}

}
}
