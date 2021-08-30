import java.util.Arrays;

public class Ex0100 {

	public static void main(String[] args) {
		int[] num = {9,8,1,3,2};
		
		
		
		for (int i = 0; i < num.length-1; i++) {
			
			for (int j = 0; j < num.length-1-i; j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1]= temp;
				}
				System.out.println(Arrays.toString(num));			
			}
			
		}
		
		
	}

}
