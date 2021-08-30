import java.util.Random;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

//		int num1 = 0;
//		int num2 = 0;
//		while (true) {
//			num1 = r.nextInt(6)+1; 
//			num2 = r.nextInt(6)+1;
//			System.out.println("(" + num1 + "," + num2 + ")");
//			if (num1 + num2 == 5) {
//				break;
//			}
//
//		}

//		while (true) {
//			int ran_num1 = r.nextInt(6)+1;   //¿Ã∑±∞‘ µ .
//			int ran_num2 = r.nextInt(6)+1;
//			System.out.printf("(%d,%d)%n",ran_num1,ran_num2);
////			System.out.printf("(%d,%D)%n",ran_num1,ran_num2);
//			
//			if(ran_num1+ran_num2==5) {
//				break;
//			}
//		}
		
		// do while πÆ
//		int num1 = 0;
//		int num2 = 0;
//		do {
//			num1 = r.nextInt(6) + 1;
//			num2 = r.nextInt(6) + 1;
//			System.out.printf("(%d,%d)%n", num1, num2);
//
//		} while (num1 + num2 != 5);
		
		
		int ran_num1 = 0;
		int ran_num2 = 0;
		do {
			ran_num1 = r.nextInt(6)+1;   
			ran_num2 = r.nextInt(6)+1;
			System.out.printf("(%d,%d)%n", ran_num1, ran_num2);
		} while (ran_num1+ran_num2 !=5);
		
		

	}

}
