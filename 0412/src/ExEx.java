import java.util.Arrays;

public class ExEx {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(arr));

	}

	public static int[] sort_method(int[] arr) {
		for (int k = 0; k < arr.length - 1; k++) {

			for (int i = 0; i < arr.length - 1 - k; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

		}
		return arr;  // 내가 새로 정립 한 값을 리턴 해준다.

	}
}
