
public class Ex02 {

	public static void main(String[] args) {
		int[] intArray1 = new int[5];
		int[] intArray2 = intArray1;   // ���� �ּҶ� ����� ���� ���� ����.
		
		intArray1[1] =3;
		System.out.println(intArray1[1]);
		
		System.out.println(intArray2[1]);
		intArray2[0]=15;
		System.out.println(intArray2[0]);
		System.out.println(intArray1[0]);
		
		int num =3;
		int temp = num;
		
		num = 7;
		System.out.println(temp);
		
		temp = 8;		
		System.out.println(num);
		
		// �迭�� ũ��(����) Ȯ��
		System.out.println(intArray1.length);
	    
		
		
		int[] a= new int[3];
		int[] b= new int[3];		
		b=a;		
		System.out.println(b);		
		System.out.println(a);
		
		
		
	}

}
