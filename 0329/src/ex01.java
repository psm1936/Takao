import java.util.Scanner;

public class ex01 {  //���� �۾��ϰ� �ִ� ���� java Ŭ���� ����
    //java ���Ͽ��� ������ �߰�ȣ��{} ����
	public static void main(String[] args) {
		//java ����� ���� ���� ����Ǵ� ����
		
		
		
		//��°� �Է�
		
		System.out.print("Hello World~!");
		System.out.println("Hello World~!");
		System.out.println("Hello World~!");
		
		System.out.println(1+1);
		System.out.println(1-1);
		System.out.println(1*1);
		System.out.println(1/1);
		
		System.out.println("1+1="+(1+1));
		System.out.println("1+1="+(1-1));
		System.out.println("1+1="+(1*1));
		System.out.println("1+1="+(1/1));
		//���ڿ� ���ڸ� ȥ���ؼ� ����Ҷ� + ��ȣ�� ���
		//���ڸ� ���ڷ� �ٲܶ�  ���ڿ� ȥ���ؼ� ���  ����+����=������µ�
		
		//�Է� 
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� :");
		int num1 = sc.nextInt();
		//� ������ Ÿ��(����, ����, �Ǽ���)�� �������� �̸� ���س�����.
		System.out.print("������ �Է� :");
		int num2 = sc.nextInt();
		System.out.println("����ڰ� �Է��� ������ :" +num1);
		System.out.println("����ڰ� �Է��� ������ :" +num2);
		System.out.println("������1 + ������2 = " +(num1+num2));
	}

}

//�ϳ��� �ڵ� ������ ������ ;(�����ݷ�) �ٿ������.
//Python : ��Ÿ�ӿ��� (������ �ؾ����� ������ �˼� ����)
//JAVA : Statement Error (�ڵ带 �Է��Ҷ� �ٷ� ������ ���)
//Java (�����ڰ� �����ϴ� ����) ->(����) -> .class(��谡 �����Ҽ��ִ� ���)