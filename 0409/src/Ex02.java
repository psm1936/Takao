import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제시어 >> ");
		String a = sc.next();
		
		while (true) {
			System.out.print("단어를 입력해 주세요 >> ");
			String b = sc.next();
			if(a.charAt(a.length()-1)!=b.charAt(0)) {
				System.out.println("틑렸습니다.");
				break;
			}else {				
				a=b;			
				
			}
		}
	}

}
