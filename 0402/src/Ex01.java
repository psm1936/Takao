import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// for 문
		
//		  for(초기화 구문; 검사조건; 반복후 작업){ 
//		       검사 조건이 true일 동안 실행될 로직		
//	     }
//		
//		for (int i = 1; i <=10; i++) {
//			System.out.println("출력 : "+i);
//		}
		
//		for(int i =1;i<=3;i++) {
//			System.out.println("출력 : "+i);			
//		}
		
//		for(int i =1; i<=100; i++) {
//			System.out.println("출력임돵 : "+i);
//		}
		
//		for(int i =100; i>0; i--) {    //초기값 을 100으로 잡고 마이너스 값을 줌으로써 내려감.
//			System.out.println("역출력임돠 : "+i);
//		}
		
		// 
		
//		char c ='0';   // 아스키 코드 값이  나온다.
//		int temp = c;
//		System.out.println(c);
//		System.out.println(temp);
		
//		for(char i='A';i<='Z';i++) {
//			System.out.print(i+" ");
//		}
		
//		for(char c = 65; c<=90; c++) {
//			System.out.print(c);
//		}
		
//		for(int i =21; i<=57;i+=2) {
//			System.out.println("출력 홀수 : " +i);
//		}
		
//		for(int i = 21; i <=57; i ++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}
		
		int num =0;
		System.out.print("입력하세요 :");
		num = sc.nextInt();
		for(int i =1;i<=num;i++) {			    
			System.out.print(i+" ");
		}
		
		
		
		
		
	}
}
