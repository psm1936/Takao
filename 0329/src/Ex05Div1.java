import java.util.Scanner;

public class Ex05Div1 {

	public static void main(String[] args) {
		//int num = 456;
		
		//�������� ��� �������� ���ؼ� ���
		
		//System.out.println("���Ȯ�� : "+((num/100)*100));
		
		
		//System.out.println("���Ȯ�� : "+((num/10)*10+1));
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("�� �Է� : ");
		int totalSecond =sc.nextInt();
		
		System.out.println(totalSecond/3600+"��"+totalSecond%3600/60+"��"+totalSecond%3600%60+"��");
		
		

	}

}
