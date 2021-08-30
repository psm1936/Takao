import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goalWeight = sc.nextInt();
		
		int day = 1;
		int mWeight = 0;
		do {
			System.out.print(day + "주차 감량 몸무게 : ");
			mWeight = sc.nextInt();
			day +=1;
			weight-=mWeight;
		} while (weight>=goalWeight);
		System.out.println(weight + "kg 달성!!  축하합니다!");
	}

}
