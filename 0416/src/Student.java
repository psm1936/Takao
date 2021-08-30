
public class Student extends Person{

	
	public Student(String name, int age) {
//		super();  // 슈퍼클래스의 기본 생성자 호출.
	   super(name,"학생",age);
		 
	}	
	
	public void study() {
		System.out.println("공부하기!");
	}
	
	
}
