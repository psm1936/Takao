import java.util.Random;

import javax.naming.ldap.Rdn;

public class Ex03 {

	public static void main(String[] args) {

		int[] array = createRandomNumber(3);
		arrayToString(array);
	}

	public static int[] createRandomNumber(int num) {
		int[] array =new int[num];   // �迭 ����.
		
		Random rd = new Random();    // ���� ���� ����		
		
		do {
			for (int i = 0; i < array.length; i++) {
				array[i] = rd.nextInt(5)+1;
			}	
		} while (isDuplicate(array));   // true, false ��� �Ǵ� true�� �ݺ�
		
		return array;
	}

	public static boolean isDuplicate(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int chek2 = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (chek2 == array[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void arrayToString(int[] array) { // �� ������ Ÿ���� �־���. �ٸ� �޾��� Ÿ���� �ִٸ� �ű⿡ ���缭 Ÿ�� ������.

		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}
