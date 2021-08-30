import java.util.Random;

import javax.naming.ldap.Rdn;

public class Ex03 {

	public static void main(String[] args) {

		int[] array = createRandomNumber(3);
		arrayToString(array);
	}

	public static int[] createRandomNumber(int num) {
		int[] array =new int[num];   // 배열 생성.
		
		Random rd = new Random();    // 랜덤 도구 생성		
		
		do {
			for (int i = 0; i < array.length; i++) {
				array[i] = rd.nextInt(5)+1;
			}	
		} while (isDuplicate(array));   // true, false 출력 되니 true면 반복
		
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

	public static void arrayToString(int[] array) { // 쓸 데이터 타입을 넣어줌. 다른 받아줄 타입이 있다면 거기에 맞춰서 타입 맞춰줌.

		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}
