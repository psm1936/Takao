import java.util.Random;
import java.util.Scanner;

public class Ex05_professor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();	
		Boolean state=true;
		int num1 = 0;
		int num2 = 0;

		while (true) {
			
			if(state == true) {
				num1 = r.nextInt(10) + 1;
				num2 = r.nextInt(10) + 1;
			}					
			System.out.println(num1 + "+" + num2 + "=");
			int result = sc.nextInt();
			if (num1 + num2 == result) {
				System.out.println("Success");			
                state = true; 
			} else {
				System.out.println("Fail");
				state = false; 
			}
			System.out.println("계속하실?(Y/N) >> ");
			String choice = sc.next();

			if (choice.equals("N")) {
				break;
			}
		}
		
		
//		Scanner sc = new Scanner(System.in);
//	      Random r = new Random();
//	      boolean state = true;
//	      while(true) {         
//	         int num1 = r.nextInt(10)+1;
//	         int num2 = r.nextInt(10)+1;
//	         System.out.print(num1+"+"+num2+"=");
//	         int result = sc.nextInt();
//	         if(num1+num2 == result) {
//	            System.out.println("Success");
//	         }else {
//	            System.out.println("Fail");
//	         }
//	         System.out.println("계속하실?(Y/N) >> ");
//	         String choice = sc.next();
//	         if(choice.equals("n")) {
//	            break;
//	         }
//	      }
//	      System.out.println("프로그램 종료");	



	}

}
