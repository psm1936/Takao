import java.util.Scanner;

public class StudentScoreMain {

	public static void main(String[] args) {
		StudentScore[] ssArr = new StudentScore[3];		
		Scanner sc = new Scanner(System.in);
		
		int[] max =new int[3];
		int[] avg = new int[3];
		for (int i = 0; i < ssArr.length; i++) {
			
			System.out.print(i+1+"��° �л��� �̸��� �Է��ϼ���. >> ");
			String name1 = sc.next();			
			System.out.print(i+1+"��° �л��� Java������ �Է��ϼ���. >> ");
			int num1 = sc.nextInt();
			System.out.print(i+1+"��° �л��� Web������ �Է��ϼ���. >> ");
			int num2 = sc.nextInt();
			System.out.print(i+1+"��° �л��� Android������ �Է��ϼ���. >> ");
			int num3 = sc.nextInt();
			ssArr[i] = new StudentScore(name1,num1,num2,num3);
			max[i]=num1+num2+num3;
			avg[i]=max[i]/3;
			System.out.println("");
		}
		
		for (int i = 0; i < ssArr.length; i++) {
			System.out.println(ssArr[i].getName()+"�� ������ "+max[i]+"��, ����� "+avg[i]+"�� �Դϴ�.");
		}

	}

	

}
