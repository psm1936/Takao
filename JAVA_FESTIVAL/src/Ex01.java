import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ : ");
		int weight = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int goalWeight = sc.nextInt();
		
		int day = 1;
		int mWeight = 0;
		do {
			System.out.print(day + "���� ���� ������ : ");
			mWeight = sc.nextInt();
			day +=1;
			weight-=mWeight;
		} while (weight>=goalWeight);
		System.out.println(weight + "kg �޼�!!  �����մϴ�!");
	}

}
