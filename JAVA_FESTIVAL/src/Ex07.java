import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("최대 공약수&최소 공배수 구하기");

		System.out.print("숫자1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 >> ");
		int num2 = sc.nextInt();
		
		int min =0;
		int max =0;
		int n = 1;
		int temp1 = num1,temp2=num2;
		if(num1<num2) {
			num1 = temp2;
			num2 = temp1;
		}
		while(n>0) {
			n = num1%num2;
			num1 = num2;
			num2 = n;
		}
		max = temp1*temp2/num1;
		
		System.out.println("최대 공약수 : "+num1);		
		System.out.println("최소 공배수 : "+max);         
                                                                      
	}

}
