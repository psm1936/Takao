package Wildanimal;

public class Lion extends WildAnimal {
	String name = "����";  //�ʵ�� �������̵� ����.
	//���
	
	// (�ż���)�������̵� : �θ�Ŭ������ �ִ� ����� �ڽ� Ŭ�������� ������ �ϴ°�
	// �ż��� �̸� ����, �Ű����� Ÿ��, 
	// ++ static, private, final �� ����� �޼���� �������̵� �Ҽ� ����.
	
	@Override //annotation(�ּ�):�����Ϸ����� �������̵��� ��Ȯ���� Ȯ���ϵ��� ����
	public void hunt() {
		System.out.println("�ܵ� ���!");
	}
}
