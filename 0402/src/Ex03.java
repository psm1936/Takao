import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;                 //����  sum:0�̴������
		for(int i =1; i<=3; i++) {   //����  i : 1�� �������
			 sum +=i;                //sum ��  i�� �־���. 1,2,3
		}
		System.out.println("�� : "+ sum);
	}

}
