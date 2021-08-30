package Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		//추상 클래스는 객체 생성 불가능 -> 상속을 통해서 서브클래스로 객체 생성해야함.
//		new Employee() 
		
		RegularEmployee r = new RegularEmployee("몰라", "김성은", 6500, 2000);
		
		PartTimeEmployee p= new PartTimeEmployee("몰라", "아구몬", 2200, 30);
		
		TempEmployee t = new TempEmployee("지하", "카이지", 4500);
		
		
		// 배열에 넣어주기. (길이3)
		Employee[] emp = new Employee[3]; 
		
		emp[0] = r;   //업캐스팅(자동 형변환)
		emp[1] = p;
		emp[2] = t;
		
		//배열에 있는 객체들 print()
		
		for (Employee e : emp) {
			e.print();
		}
		
		
	}

}
