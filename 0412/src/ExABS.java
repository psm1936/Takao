import java.util.Arrays;

public class ExABS {

	public static void main(String[] args) {
		
		// math abs  절대값 구하기
		
		int num =abs_Method(-5);
		System.out.println(num);
		
		System.out.println(Math.abs(-8));
		
	}
	
	public static int abs_Method(int num) {
		int result = num;
		
		if(num<0) {
			result= num * -1;
		}
		
		return result;
	}

}
