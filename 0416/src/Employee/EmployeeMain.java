package Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		//�߻� Ŭ������ ��ü ���� �Ұ��� -> ����� ���ؼ� ����Ŭ������ ��ü �����ؾ���.
//		new Employee() 
		
		RegularEmployee r = new RegularEmployee("����", "�輺��", 6500, 2000);
		
		PartTimeEmployee p= new PartTimeEmployee("����", "�Ʊ���", 2200, 30);
		
		TempEmployee t = new TempEmployee("����", "ī����", 4500);
		
		
		// �迭�� �־��ֱ�. (����3)
		Employee[] emp = new Employee[3]; 
		
		emp[0] = r;   //��ĳ����(�ڵ� ����ȯ)
		emp[1] = p;
		emp[2] = t;
		
		//�迭�� �ִ� ��ü�� print()
		
		for (Employee e : emp) {
			e.print();
		}
		
		
	}

}
