import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int mm =0;
		
		if(time>8) {
			mm = (time-8)*7500+40000;
			System.out.println("�� �ӱ���" + mm +"�� �Դϴ�.");
		}else {
			mm=time*5000;
			System.out.println("�� �ӱ���" + mm +"�� �Դϴ�.");
		}

	}

}
