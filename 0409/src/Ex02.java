import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���þ� >> ");
		String a = sc.next();
		
		while (true) {
			System.out.print("�ܾ �Է��� �ּ��� >> ");
			String b = sc.next();
			if(a.charAt(a.length()-1)!=b.charAt(0)) {
				System.out.println("�z�Ƚ��ϴ�.");
				break;
			}else {				
				a=b;			
				
			}
		}
	}

}
