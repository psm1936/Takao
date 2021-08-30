
public class EX04 {

	public static void main(String[] args) {
		int num = 1;
		int num1 = -2;
		
		int sum =0;
		
		for (int i = 1; i <= 100; i++) {
			sum -= num;
			num +=2;
		}
		for (int i = 1; i < 99; i++) {
			sum+=num1;
			num1 -=2;
		}
		System.out.println(sum);

	}

}
