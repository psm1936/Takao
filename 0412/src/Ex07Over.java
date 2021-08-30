
public class Ex07Over {

	public static void main(String[] args) {

		// 메소드 오버로딩

		// 두 개의 정수를 입력 받아 두 수의 합을 리턴하는 addInteger() 메소드 만들기
		System.out.println(add(10, 20));
		

		System.out.println(add(10.3, 20.9));
		
		//
		System.out.println(add(10.5, 20));
		
		
		System.out.println(add(10, 20, 30));  
		
		System.out.println(add(5, 10));
		
		// 메소드 오버로딩 : 메소드의 이름은 하나, 매개변수를 다르게 함으로써 메소드를 여러개 만드는 기법
		
		// 매개변수의 타입이나 개수가 달라야한다.	

	}

	public static int add(int n1, int n2) {

		return n1 + n2;
	}

	public static double add(double n1, double n2) {

		return n1 + n2;
	}
	
	public static double add(double n1, int n2) {
		return n1 + n2;
	}
	
	public static int add(int n1, int n2 , int n3) {
		
		return n1+n2+n3;
	}

}
