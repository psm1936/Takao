
public class Ex04Comparison {

	public static void main(String[] args) {
		// 비교 연산자
		int num1 = 3;
		int num2 = 10;
		
		System.out.println(num1 == num2);  //숫자 비교  숫자는 원시변수O 
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1.equals(str2));  // 문자 비교   string은 원시변수X
		

	}

}
