
public class Ex06 {

	public static void main(String[] args) {
		
		int base =2;
		int n =3;
		
		int result = powerN(base, n);
		System.out.println("결과 확인 : "+ result);

	}
	public static int powerN(int num1 , int num2) {
		int result =1;

		for (int i = 1; i <= num2; i++) {
			result = result*num1;
		}
		return result;
	}

}
