import java.util.Scanner;

public class ex01 {  //현재 작업하고 있는 파일 java 클래스 파일
    //java 파일에서 단위를 중괄호로{} 구븐
	public static void main(String[] args) {
		//java 실행시 가장 먼저 실행되는 영역
		
		
		
		//출력과 입력
		
		System.out.print("Hello World~!");
		System.out.println("Hello World~!");
		System.out.println("Hello World~!");
		
		System.out.println(1+1);
		System.out.println(1-1);
		System.out.println(1*1);
		System.out.println(1/1);
		
		System.out.println("1+1="+(1+1));
		System.out.println("1+1="+(1-1));
		System.out.println("1+1="+(1*1));
		System.out.println("1+1="+(1/1));
		//문자와 숫자를 혼합해서 출력할때 + 기호를 사용
		//숫자를 문자로 바꿀때  문자와 혼합해서 사용  문자+숫자=문자출력됨
		
		//입력 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 :");
		int num1 = sc.nextInt();
		//어떤 데이터 타입(정수, 문자, 실수등)의 변수인지 미리 정해놔야함.
		System.out.print("정수값 입력 :");
		int num2 = sc.nextInt();
		System.out.println("사용자가 입력한 정수값 :" +num1);
		System.out.println("사용자가 입력한 정수값 :" +num2);
		System.out.println("정수값1 + 정수값2 = " +(num1+num2));
	}

}

//하나의 코드 문장이 끝날떄 ;(세미콜론) 붙여줘야함.
//Python : 런타임오류 (실행을 해야지만 에러를 알수 있음)
//JAVA : Statement Error (코드를 입력할때 바로 에러를 출력)
//Java (개발자가 개발하는 파일) ->(실행) -> .class(기계가 이해할수있는 언어)