import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;                 //변수  sum:0이담겨있음
		for(int i =1; i<=3; i++) {   //변수  i : 1이 담겨있음
			 sum +=i;                //sum 에  i를 넣어줌. 1,2,3
		}
		System.out.println("합 : "+ sum);
	}

}
