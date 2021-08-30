package Wildanimal;

public class WildMain {

	public static void main(String[] args) {
	    WildAnimal w = new WildAnimal();
		Lion l = new Lion(); //Lion extents
		
		
		// ��ĳ���� : ����Ŭ������ ����Ŭ���� Ÿ������ �ڵ� Ÿ�Ժ�ȯ�ϴ°�
		// ��ü(lion) �� ����, �޼ҵ� �� ������ �� ���� ���� Ŭ����(WildAnimal)�� ����, �޼ҵ忡�� ���� ����.
		// �޼ҵ� �������̵� �� ��쿡�� ���� ��ü �޼ҵ忡 ���� ����.
		WildAnimal l2 = new Lion();
		l2.hunt();
		
		// �ʵ�� �������̵� ����.
		System.out.println(l2.name);
		
		// �ٿ� ĳ���� : ��ĳ���� �� ���� ���� ����ȯ���� ���� Ÿ������ �ٽ� �ǵ����� ��
		Lion l3 = (Lion)l2;
		System.out.println(l3.name);
		
		Eagle e = new Eagle();
		WildAnimal e2 = e;
	
		
		w.hunt();
		l.hunt();
		e.hunt();
		
		//��ĳ������ �Ѱ�� ���۷��� ������ ����Ű�� ��ü�� ��¥ Ŭ���� Ÿ�� ������ �����
		// instanceof : ������ ����Ű�� ��ü�� � Ŭ���� Ÿ��?
		System.out.println(l2 instanceof WildAnimal);
		System.out.println(l2 instanceof Lion);
		System.out.println(e instanceof Eagle);
        System.out.println(e2 instanceof Lion);
}
}
