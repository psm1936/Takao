import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		// �迭�� �Ѱ�
		// ���� ũ�⸦ �Ѿ ���� ������ �� ����.
		
		// Collection
		// ��Ҷ�� �Ҹ��� ���� ������ ��ü���� ����.
		// Ư¡
		// �⺻ �ڷ��� ��ҷ� �Ұ���.
		
		// ArrayList
		// ���� ���������� ���� ���, �÷��� Ŭ������ ��ü�� ����.
		ArrayList<String> list = new ArrayList<String>();
		// ������ �߰�
		list.add("Hello");
		list.add("Hi");
		list.add("java");
	
		//������ ��������
		System.out.println(list.get(0));
		
		// �߰��� ������ ����
		list.add(1,"pythonn");
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// ������ ����
		System.out.println(list.size());
		
		// ������ ����
		list.remove(0);		
		System.out.println(list.get(0));
		
		// ��� ��� ����  
		list.clear();
		System.out.println(list.size());
		
	
	}

}
