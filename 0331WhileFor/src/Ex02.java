import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw= true;
		
		while(sw) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			
			if(num>10 || num%2==0) {	
				sw=false;
				System.out.println("����Ǿ����ϴ�.");							
			}
			
//			while(true) {
//				System.out.print("���� �Է� : ");
//				int num = sc.nextInt();
//				
//				if(num>10 || num%2==0) {	
//					
//					System.out.println("����Ǿ����ϴ�.");	
//					break;
//				}	
			
		}

	}

}
