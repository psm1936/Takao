package ���_������;

public class C extends B{
	public C() {
		System.out.println("C ����!");
	}
	
	public C(int x) {
		super(x);     //����Ŭ���� �����ڸ� ��������� ����
		System.out.println("C(x)����!");
	}
	
	public C(int x, int y) {
		super(x, y);
		System.out.println("C(x,y)����!");
	}

}
