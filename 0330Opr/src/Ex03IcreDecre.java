
public class Ex03IcreDecre {

	public static void main(String[] args) {
		// ���� ������
		// ++  (���� ������)
		// --  (���� ������)
		
		int i =3;
		System.out.println(++i);  // �ٷ� ��������.        4 
		System.out.println(i++);  // ������ ����Ҷ� ��������. 4
		System.out.println(i);    // ��� �ϴ� ��������.     5
		
		int hap=0,j=0,k=0,l=0;
		hap = ++j + k++ + ++l;
		System.out.println(hap +","+j+","+k+","+l);
				
		int a=3,b=4,c=5,d=5;
		a+=6 + --b;
		d*=7 - c++;
		System.out.println(a+","+b+","+c+","+d);

	}

}
