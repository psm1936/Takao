import java.util.Random;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// 행운의 숫자 뽑기
		// 로또 번호 1~ 45까지 존재
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		int[] rotto = new int[6];		
		
		for (int i = 0; i < rotto.length; i++) {			
			rotto[i]= r.nextInt(45)+1;
			
			for (int j = 0; j < i; j++) {
				if(rotto[i]==rotto[j]) {
					i--;					
				}
			}
		}
		
		for (int k = 0; k < rotto.length; k++) {
			System.out.println("행운의 숫자는 : "+rotto[k]);
		}
		
		
	}

}
