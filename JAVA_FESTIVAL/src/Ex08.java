import java.util.Scanner;
import java.util.function.Function;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("n ют╥б : ");
		int n = sc.nextInt();
		
		int a1 =1;
		int a2 =0;	
		int i =1;
		int count =1;
		System.out.print(a1+" ");
		while(count<=n-1) {
			a2+=i;
			a1+=a2;
			count+=1;
			System.out.print(a1+" ");
		}
//		for(int i =1;count<=n-1;) {
//			a2+=i;
//			a1+=a2;
//			count+=1;
//			System.out.print(a1+" ");
//			
//		}
	}

}
