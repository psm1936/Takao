import java.util.Random;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// ����� ���� �̱�
		// �ζ� ��ȣ 1~ 45���� ����
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
			System.out.println("����� ���ڴ� : "+rotto[k]);
		}
		
		
	}

}
