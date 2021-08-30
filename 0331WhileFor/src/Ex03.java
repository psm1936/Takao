import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
				
		// while문 
		
		// for문 - 범위를 명확히 알때.
		
		// do - while문 
		
//		do {
//			반드시 한번은 실행되어야 하는 로직
//		} while (조건식);
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("현재 몸무게 : ");
		int weight1 = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int mWeight1 =sc.nextInt();
		
		int day = 1;
				
		do {
			System.out.print(day+"주차 감량 몸무게 : ");
			int minus1 = sc.nextInt();
			day+=1;
			weight1-=minus1;  //뺴기로 들어감.			
		} while (weight1>=mWeight1);  // 조건식 이 맞다면 계속 반복을 돌려줘라 
		System.out.println(weight1+"달성!! 축하합니다!");
		
		
		

	}

}
