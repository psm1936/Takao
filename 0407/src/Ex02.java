import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = {1,4,3,2,1};
		int[] num1 = new int[5];
		int dam =20;
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		
		int num =0;
		int max =0;
		for (int i = 0; i < input.length; i++) {
			System.out.print(i+1+"���� >>");
			num = sc.nextInt();
			num1[i]=num;
		}
		
		System.out.println("����Ȯ��");
		for (int i = 0; i < input.length; i++) {
			if(input[i]==num1[i]) {
				System.out.print("O ");
				max+=1;
			}else {
				System.out.print("X ");
			}
		}
		System.out.print(" �� �� : "+(max*dam));
	}

}
