import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 반복문
		
		// 1. 범위를 반복 (배열, 리스트 등) for
		// 2. 특정 시점까지 반복(무한 반복)  while
		
		// 전체 선택
		// ctrl + a
		// 자동 정렬  
		// ctrl + shift +f
	
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			// while :조건식 true였을떄 반복
			// 사용자에게 0이라는 값을 입력 받았을때 종료
			int num = sc.nextInt();
			System.out.println("사용자가 입력한 값 : "+ num);
			
			if(num==0) {
				System.out.println("프로그램종료");
				break;
			}
		}
		
	}

}
