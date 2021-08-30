package Employee;

public abstract class Employee {
	
	// 속성
 	private String empno;
 	private String name;
 	private int pay;
 	
 	//기능정의
 	
 	//pay를 리턴
 	// 추상 메소드 :정의만 해둠, 상속받아 작성한 클래스에서 오버라이딩
 	public abstract int getMoneyPay(); 
 	
 	//사원번호 : 이름:월급
 	public abstract void print(); 

}
