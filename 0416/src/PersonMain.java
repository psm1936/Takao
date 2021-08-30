

public class PersonMain {

	public static void main(String[] args) {
		// Student ��ü ����
		Student student = new Student("�輺��", 23);
		// Teacher ��ü ����
		Teacher teacher = new Teacher("�����", 21, 15000);
		
		// �迭����(���� 2) ��ĳ���� �Ǵ� ����..
		Person[] arr = new Person[2];
		//student ��ü�� teacher��ü �ڵ�����ȯ-> Person (��ĳ����)
		arr[0] = student;
		arr[1] = teacher;
		
		for (Person p : arr) {
			System.out.println("�̸� : "+p.getName());
			System.out.println("���� : "+p.getJob());
			System.out.println("���� : "+p.getAge());
			System.out.println("===========================");
		}
		
		//�ٿ� ĳ���� : ���� ����ȭ
		
		// ����Ÿ�Կ��� ����Ÿ������ ���ҋ� ����ؾ���.
		
		
		//student.study(); ȣ��
				
		Student student2 =(Student)arr[0];
		
		student2.study();
		
		//teacher ���� ȣ��
		
		Teacher teacher2 = (Teacher)arr[1];
		
		System.out.println(teacher2.getPay());
		teacher2.getPay();
		teacher2.teach();
	}

}
