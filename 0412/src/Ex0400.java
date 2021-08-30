
public class Ex0400 {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 3, 2 };

		int[] sb = strikeBallCounting(array1, array2);
		arrayToString(sb);
	}
	
	public static int[] strikeBallCounting(int[] array1, int[] array2) {
		int[] sb = new int[2];
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					if(i == j) {
						sb[0]++;
					}else {
						sb[1]++;
					}
				}
			}
		}return sb;
		
	}
	
	public static void arrayToString(int[] array) {

		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}
