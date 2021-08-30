
public class Person { // value 오브젝트 클래스
	
	private String name;
	private int age;
	   
	
	
	// 가장 먼저 객체 생성시 샐행되어야 하는 기능을 작성
	public Person(String name, int age) {
		
		this.name = name; //이 전체의 name 이라고 지정해준다. this
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	}
