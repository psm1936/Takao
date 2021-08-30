import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.println("3과 5의 배수입니다.");
		}
		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		
//		//age가 20세 이상이면 "성인입니다. 출력
//		
//		if(age>=20) {
//			System.out.println("성인입니다.");
//		}else {
//			System.out.println("미성년자입니다.");
//		}
//		
        
		
	}

}
