import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = 0;
		int x = 0;
		int dab =0;	
		
		System.out.print("N �Է� >> ");
		n = sc.nextInt();
		System.out.print("X �Է� >> ");
		x = sc.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print((i+1)+"��° ���� �Է� >> ");
			dab = sc.nextInt();				
			if(dab<x) {
				a[i]=dab;
			}
		}	
		
		System.out.print("��� >> ");
		for (int i = 0; i < n; i++) {
			if(a[i]!=0) {
				System.out.print(a[i]+" ");
			}			
		}
		
		
		
	}

}
