import java.util.Scanner;

public class ex00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] range = {6,2,5,5,4,5,6,3,7,6};
		int result = 0;
		
		System.out.println("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String num1 = sc.next();
		
		int[] numRange = new int[num1.length()];
		for (int i = 0; i < numRange.length; i++) {
			if(numRange.equals("1")){
				result+=6;
			}else if(numRange.equals("2")) {
				result+=2;
			}
			else if(numRange.equals("3")) {
				result+=5;
			}
			else if(numRange.equals("4")) {
				result+=5;
			}
			else if(numRange.equals("5")) {
				result+=4;
			}
			else if(numRange.equals("6")) {
				result+=5;
			}
			else if(numRange.equals("7")) {
				result+=6;
			}
			else if(numRange.equals("8")) {
				result+=3;
			}else if(numRange.equals("9")) {
				result+=7;
			}else if(numRange.equals("0")) {
				result+=6;
			}
		}
		
		System.out.print("���('-')��  ���� >> "+result);
		
		

	}

}
