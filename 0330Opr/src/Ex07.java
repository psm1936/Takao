import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		
		float tMoney = (float) (5000 * 1.5);
		int money = time>8?((time-8)*(int)tMoney)+(8*5000):time*5000;
		
		System.out.println("�� �ӱ��� "+money +"�� �Դϴ�");
		
		// int num1 = sc.nextInt();		
		// System.out.println(num1 > 8?40000+(int)((num1-8)*5000*1.5) :num1*5000);

	}

}
