import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		// if문 : 순차적으로 조건을 비교하면서 코드가 진행
		if (totalScore>=90) {
			System.out.println("A학점입니다!");
		}else if(totalScore>=80) {
			System.out.println("B학점입니다!");
		}else if(totalScore>=70) {
			System.out.println("C학점입니다!");
		}else {
			System.out.println("D학점입니다!");
		}
		
		
		// if문을 각각 따로 구현했을 때는 개별적으로 코드가 진행
		if (totalScore>=90) {
			System.out.println("A학점입니다!");
		}
		if(totalScore>=80) {
			System.out.println("B학점입니다!");
		}
		if(totalScore>=70) {
			System.out.println("C학점입니다!");
		}else {
			System.out.println("D학점입니다!");
		}
		
		
		String grade;
		// if문 : 순차적으로 조건을 비교하면서 코드가 진행
		if (totalScore>=90) {
			grade= ("A");
		}else if(totalScore>=80) {
			grade= ("B");
		}else if(totalScore>=70) {
			grade= ("C");
		}else {
			grade= ("D");
		}System.out.println(grade+"학점입니다!");

	}

}
