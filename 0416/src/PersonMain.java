

public class PersonMain {

	public static void main(String[] args) {
		// Student 객체 생성
		Student student = new Student("김성은", 23);
		// Teacher 객체 생성
		Teacher teacher = new Teacher("김미희", 21, 15000);
		
		// 배열생성(길이 2) 업캐스팅 되는 과정..
		Person[] arr = new Person[2];
		//student 객체와 teacher객체 자동형변환-> Person (업캐스팅)
		arr[0] = student;
		arr[1] = teacher;
		
		for (Person p : arr) {
			System.out.println("이름 : "+p.getName());
			System.out.println("직업 : "+p.getJob());
			System.out.println("나이 : "+p.getAge());
			System.out.println("===========================");
		}
		
		//다운 캐스팅 : 강제 형변화
		
		// 상위타입에서 하위타입으로 변할떄 명시해야함.
		
		
		//student.study(); 호출
				
		Student student2 =(Student)arr[0];
		
		student2.study();
		
		//teacher 연봉 호출
		
		Teacher teacher2 = (Teacher)arr[1];
		
		System.out.println(teacher2.getPay());
		teacher2.getPay();
		teacher2.teach();
	}

}
