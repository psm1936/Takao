
public class Ex0500 {

	public static void main(String[] args) {
		int num = 77;
		int sum = 0;
		
		for (int i = 1; i <= 77; i++) {
			sum +=num*i;
			num--;
		}
		System.out.println(sum);
	}

}
