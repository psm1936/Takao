import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex03_split {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		// ���ڿ�.split(���ڿ�) -> �Ű������� ���� ���ڿ��� �������� �߶� �迭�� ��ȯ
		String phone2 ="010-2407-1465";
		String[] cut = phone2.split("-");
		System.out.println(Arrays.toString(cut));
		
		
	}

}
