import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = "�ƴ� ����� ��ħ�̿���!";
//		
//		// ���ڿ�.indexOf("����") -> �Ű������� ���� ������ ��ġ ����
//		
//		System.out.println("==indexOf==");
//		System.out.println(data.indexOf("��",5));  // �տ��� ã�� ,5���ķ� ã��
//		
//		// ���ڿ�.contains("����") -> �Ű������� ���� ���ڿ��� ���ԵǾ� �ִ��� �Ǻ�		
//		System.out.println("==contains==");
//		System.out.println(data.contains("��"));  //���ԵǾ� �ִ��� True,False �� Ȯ��.
//		System.out.println(data.contains("!"));
		
//		String data1 = "010-2407-1065";
//		
//		System.out.print("�˻��� ���� �Է� : ");
//		String m = sc.next();
//		
//		if(data1.contains(m)) {
//			System.out.println(m+"�� ���ԵǾ��ֽ��ϴ�.");
//		}else {
//			System.out.println(m+"�� ���ڿ��� ���ԵǾ����� �ʽ��ϴ�.");
//		}
		
		// ���ڿ�.substrind(startIndex, endIndex)
		// �Ű������� ���� ��ġ���� ���ڿ��� �߶� �����ϴ� �޼ҵ�
		System.out.println("==substring==");
		System.out.println(data.substring(4));
		System.out.println(data.substring(1, 7));
		
		// ���ڿ�.charAt(�ε���) -> ���ڿ����� �Ű������� ���� �ε�����° ���ڸ� ��ȯ
		System.out.println("==charAt==");                  // ���� �ϳ� �̾ƿ�.
		System.out.println(data.charAt(data.length()-1));  // �ε����ϴ°Ͱ� ���
		
		
	}

}
