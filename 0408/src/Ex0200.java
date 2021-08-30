import java.util.Arrays;

public class Ex0200 {

	public static void main(String[] args) {
		int[] num = {9,8,1,3,2};
		
		for (int k = 0; k < num.length; k++) {
			int maxIndex = k;
			for (int i = k+1; i < num.length; i++) {
				if(num[maxIndex]<num[i]) {
					maxIndex = i;
				}
				
			}
			int temp = num[k];     // 이거 생각보다 왤케 헷갈림?
			num[k]=num[maxIndex];
			num[maxIndex] = temp;
			System.out.println(Arrays.toString(num));	
		}
		
	}

}
