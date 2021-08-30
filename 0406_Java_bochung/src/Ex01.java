import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// 반복문
		// for, while, do while
		
		// while  무한반복 할때. 반복 횟수를 모를때
		
		// for  반복횟수를 알때
		
		// do while 
		
		// 총합에 더해줄 수
		int sum =0;
		// 총합
		int num =0;
	
		while (num<=1000) {		//반복을 할 조건 : ex)1000이 넘어가지 않을때까지.
			num +=sum;
			sum+=1;
		}
		System.out.println( "1부터 " +(sum-1)+"까지 총 합: "+num);
		
//		//총합
//		int sum =0;
//		//총합에 더해줄 수
//		int num =0;
//		
//		while (true) {   //반복을 할 조건
//			sum = sum+num; //누적
//			
//			if(sum>1000) {
//				break;
//			}
//			num++;    // 위치 신경
//			
//		}
//		System.out.printf("1부터 %d까지 총 합 : %d",num,sum);
		
		
		
	}

}
