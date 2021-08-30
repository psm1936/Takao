import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//내가 한거
		
//		int maxNum=0;
//		int gNum =0;
//		while(true) {
//			System.out.println("숫자를 입력하세요");
//			int num =sc.nextInt();		
//			
//			if(num>=0 && num<=100) {
//				maxNum +=num;
//				gNum+=1;
//			}else {
//				break;
//			}
//		}
//		System.out.println("합계 : "+maxNum);
//		System.out.println("평균 : "+((float)maxNum/(float)gNum));
		
		
		// 은식씨꺼
		
//		int num1 = 0;
//		int time = 0;
//		while (true) {
//			System.out.println("숫자를 입력하세요");
//			int num = sc.nextInt();
//			if (num < 0 || num > 100) {
//				break;
//			}
//
//			num1 += num;
//			time++;
//		}
//		System.out.println("합계 : " + num1);
//		System.out.println("평균 : " + (float) num1 / time);
		
//		int maxNum=0;
//		int gNum =0;
//		int num =0;
//		do {
//			System.out.println("숫자를 입력하세요");
//			num =sc.nextInt();
//			if(num>=0 && num<=100) {
//				maxNum +=num;
//				gNum +=1;
//			}			
//			
//		} while (num>=0 && num<=100);			
//		System.out.println("합계 : "+maxNum);
//		System.out.println("평균 : "+(float)maxNum/gNum);
		
		//강사님꺼
//		int num =0;
		int sum = 0;
		int cnt = 0;
		
		// do while문
		
//		do {
//			System.out.print("숫자를 입력하세요 >>");
//			num = sc.nextInt();			
//			if(num>=0 && num<=100) {
//				sum +=num; //sum = sum + num
//				cnt++;     //cnt+=1
//			}
//		} while (num>=0 && num<=100);
//		System.out.println("합계 : "+ sum);
//		System.out.println("평균 : "+ (float)sum/cnt);
		
		
		//while 문 
		
//	    while(num>=0 && num<=100) {
//	    	System.out.print("숫자를 입력하세요 >>");
//			num = sc.nextInt();			
//			if(num>=0 && num<=100) {
//				sum +=num; //sum = sum + num
//				cnt++;     //cnt+=1
//	      }
		
		//무한 반복문
						
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();			
			
			if(num<0 || num>100) {  // 이 조건에 만족하면 break해서  아래로 내려가는것을 막는다.			
				break;
			}
			sum+=num;  // 아래에 있으면 위에서 걸러서 아래로 내려오기 때문에 걸러진다.
			cnt++;
		}
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ (float)sum/cnt);	
	    
	}

}
