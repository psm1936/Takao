import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {		
		Scanner sc =new Scanner(System.in);
		Random r = new Random();
		
		String con = "";
		int rNum1=0;
		int rNum2=0;
		int dab =0;		
		
		System.out.println("==Plus Game==");
		do {			
			rNum1 = r.nextInt(20)+1;
			rNum2 = r.nextInt(20)+1;
			do {								
				System.out.print(rNum1 +"+"+rNum2+"= ");
				dab=sc.nextInt();
				if(dab ==(rNum1+rNum2)) {
					System.out.println("Success");               //if �� �ް� success�϶� �������� ���� �༭ �ٽõ���. 
				}else {
					System.out.println("Fail");
				}	
				
				System.out.print("��� �Ͻðڽ��ϱ� >> ");
				con = sc.next();
			}while(dab !=(rNum1+rNum2) && con.equals("Y"));			
		}while(con.equals("Y")); 
		System.out.println("����");

	}

}
