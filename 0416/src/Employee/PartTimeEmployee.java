package Employee;

public class PartTimeEmployee extends Employee {
	
	private String empno;
 	private String name;
 	private int pay;    //하루일당.
 	private int workDay; //한달에 일한 날
 	

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}

	@Override                     
	public int getMoneyPay() {    //월급여
		
		return pay*workDay;
	}

	@Override
	public void print() {
		System.out.println(empno +":"+name+":"+pay);
		
	}
	
	
	
	
}
