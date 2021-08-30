
public class Expressions {
	public static int expressions(int num) {
		int count =0;
		int sum = 0;
		for (int j = 0; j < num; j++) {
			for (int i = j+1; i <= num; i++) {
				sum +=i;
				if(sum == num) {
					count++;
					break;
				}
			}
		}
		
		
		return count;
	}

}
