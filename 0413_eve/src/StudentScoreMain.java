import java.util.Scanner;

public class StudentScoreMain {

	public static void main(String[] args) {
		StudentScore[] ssArr = new StudentScore[3];		
		Scanner sc = new Scanner(System.in);
		
		int[] max =new int[3];
		int[] avg = new int[3];
		for (int i = 0; i < ssArr.length; i++) {
			
			System.out.print(i+1+"번째 학생의 이름을 입력하세요. >> ");
			String name1 = sc.next();			
			System.out.print(i+1+"번째 학생의 Java점수를 입력하세요. >> ");
			int num1 = sc.nextInt();
			System.out.print(i+1+"번째 학생의 Web점수를 입력하세요. >> ");
			int num2 = sc.nextInt();
			System.out.print(i+1+"번째 학생의 Android점수를 입력하세요. >> ");
			int num3 = sc.nextInt();
			ssArr[i] = new StudentScore(name1,num1,num2,num3);
			max[i]=num1+num2+num3;
			avg[i]=max[i]/3;
			System.out.println("");
		}
		
		for (int i = 0; i < ssArr.length; i++) {
			System.out.println(ssArr[i].getName()+"의 총점은 "+max[i]+"점, 평균은 "+avg[i]+"점 입니다.");
		}

	}

	

}
