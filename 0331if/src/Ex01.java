import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int totalScore = sc.nextInt();
		
		// if�� : ���������� ������ ���ϸ鼭 �ڵ尡 ����
		if (totalScore>=90) {
			System.out.println("A�����Դϴ�!");
		}else if(totalScore>=80) {
			System.out.println("B�����Դϴ�!");
		}else if(totalScore>=70) {
			System.out.println("C�����Դϴ�!");
		}else {
			System.out.println("D�����Դϴ�!");
		}
		
		
		// if���� ���� ���� �������� ���� ���������� �ڵ尡 ����
		if (totalScore>=90) {
			System.out.println("A�����Դϴ�!");
		}
		if(totalScore>=80) {
			System.out.println("B�����Դϴ�!");
		}
		if(totalScore>=70) {
			System.out.println("C�����Դϴ�!");
		}else {
			System.out.println("D�����Դϴ�!");
		}
		
		
		String grade;
		// if�� : ���������� ������ ���ϸ鼭 �ڵ尡 ����
		if (totalScore>=90) {
			grade= ("A");
		}else if(totalScore>=80) {
			grade= ("B");
		}else if(totalScore>=70) {
			grade= ("C");
		}else {
			grade= ("D");
		}System.out.println(grade+"�����Դϴ�!");

	}

}
