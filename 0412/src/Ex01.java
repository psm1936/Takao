import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// �޼ҵ�  �迭  �߱�����
		
		int[] array = {1,3,4,8,7,9,10};
		arrayToString(array);          // ȣ�⸸ �ϰ� ����.
		
	}
	
	// static : ���� (�������� �ּҰ��� ������ �ִ�.)
	public static void arrayToString(int[] array) {     // �� ������ Ÿ���� �־���.    �ٸ� �޾��� Ÿ���� �ִٸ� �ű⿡ ���缭 Ÿ�� ������.
		
		for (int num : array) {
			System.out.print(num+" ");
		}	
	}

}
