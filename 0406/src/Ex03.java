
public class Ex03 {

	public static void main(String[] args) {
		// ������ ������ �������� ���� �� �ִ� ���۷��� ����  array�� ����
		int[] array;
		
		// ������ ������ 5���� ���� �� �ֵ��� �迭�� �����ؼ� array�� ����.
		array = new int[5];  // 0���� �ʱ�ȭ�Ǿ�����.
		
		// ������ �ε����� 1~20 ������ ���� ����
		array[0] =20;
		array[1] =10;
		array[2] =8;
		array[3] =13;
		array[4] =1;
		
		// �迭 array�� ����ִ� ��� �����͸� ���
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		// �迭 ���ϱ�.
		System.out.println(array[1]+array[4]);
		
		// �迭 array�� ����ִ� ��� ������ ���ؼ� ��� ���
		int sum=0;		
		for (int i = 0; i < array.length; i++) {
			sum +=array[i];			
		}
		System.out.println(sum);
		System.out.println((float)sum/array.length);
		
	}

}
