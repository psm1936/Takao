
public class Ex07Over {

	public static void main(String[] args) {

		// �޼ҵ� �����ε�

		// �� ���� ������ �Է� �޾� �� ���� ���� �����ϴ� addInteger() �޼ҵ� �����
		System.out.println(add(10, 20));
		

		System.out.println(add(10.3, 20.9));
		
		//
		System.out.println(add(10.5, 20));
		
		
		System.out.println(add(10, 20, 30));  
		
		System.out.println(add(5, 10));
		
		// �޼ҵ� �����ε� : �޼ҵ��� �̸��� �ϳ�, �Ű������� �ٸ��� �����ν� �޼ҵ带 ������ ����� ���
		
		// �Ű������� Ÿ���̳� ������ �޶���Ѵ�.	

	}

	public static int add(int n1, int n2) {

		return n1 + n2;
	}

	public static double add(double n1, double n2) {

		return n1 + n2;
	}
	
	public static double add(double n1, int n2) {
		return n1 + n2;
	}
	
	public static int add(int n1, int n2 , int n3) {
		
		return n1+n2+n3;
	}

}
