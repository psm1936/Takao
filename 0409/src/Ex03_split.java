import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex03_split {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		// 문자열.split(문자열) -> 매개변수로 넣은 문자열을 기준으로 잘라 배열로 반환
		String phone2 ="010-2407-1465";
		String[] cut = phone2.split("-");
		System.out.println(Arrays.toString(cut));
		
		
	}

}
