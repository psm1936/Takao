import org.omg.CORBA.PUBLIC_MEMBER;

public class Ex04 {

	public static void main(String[] args) {

		// �޼ҵ� (Method)
		// ��ü�� ������ ǥ���ϱ� ���� ��
		// �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ� ��

		// �޼ҵ��� �⺻ ����

		// public ���� ������ : ����

		// ���� Ÿ��
		
		int result= addNumber(10, 15);
		System.out.println(result);

	}

	// ���� Method �� ���Ե� class �ȿ��� ���ο� Method�� ������� �Ҷ���
	// static Ű���带 �ٿ��ش�.
	public static int addNumber(int n1, int n2) {  // public �ٱ����� ���� ����
		int result = n1 + n2;
		return result;

	}
}
