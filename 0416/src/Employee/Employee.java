package Employee;

public abstract class Employee {
	
	// �Ӽ�
 	private String empno;
 	private String name;
 	private int pay;
 	
 	//�������
 	
 	//pay�� ����
 	// �߻� �޼ҵ� :���Ǹ� �ص�, ��ӹ޾� �ۼ��� Ŭ�������� �������̵�
 	public abstract int getMoneyPay(); 
 	
 	//�����ȣ : �̸�:����
 	public abstract void print(); 

}
