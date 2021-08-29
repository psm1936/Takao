import java.util.Scanner;

public class Ex05Div1 {

	public static void main(String[] args) {
		//int num = 456;
		
		//나누기의 몫과 나머지를 통해서 계산
		
		//System.out.println("결과확인 : "+((num/100)*100));
		
		
		//System.out.println("결과확인 : "+((num/10)*10+1));
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("초 입력 : ");
		int totalSecond =sc.nextInt();
		
		System.out.println(totalSecond/3600+"시"+totalSecond%3600/60+"분"+totalSecond%3600%60+"초");
		
		

	}

}
