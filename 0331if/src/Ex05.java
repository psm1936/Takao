import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 스위칭 변수
		boolean sw = true; // true 일때 무한반복 false로 끝낸다.
		
		
		while (sw) {
			System.out.print("금액 : ");
			int money = sc.nextInt();
			System.out.println("메뉴 : 1번>콜라800원  2번>생수500원  3번>비타민워터1500원 4번> 종료");
			int menu = sc.nextInt();

			int aMoney = 0;

			switch (menu) {
			case 1:
				System.out.println("콜라를 선택하셨습니다!");
				aMoney = money - 800;
				break;
			case 2:
				System.out.println("생수를 선택하셨습니다!");
				aMoney = money - 500;
				break;
			case 3:
				System.out.println("비타민워터를 선택하셨습니다!");
				aMoney = money - 1500;
				break;
			case 4:
				System.out.println("프로그램 종료");
				sw = false;
                break;
			default:
				System.out.println("다시 선택해주세요");
				break;

			}
			if (aMoney < 0) {
				System.out.println("돈이 부족해요 ㅠㅠ ");
			} else {
				System.out.println("잔돈 : " + aMoney);
				System.out.println("천원 : " + (aMoney / 1000));
				System.out.println("오백원 : " + (aMoney % 1000 / 500));
				System.out.println("백원 : " + (aMoney % 1000 % 500 / 100));
				System.out.println("맛있게 드세요 ^^");
			}

		}
	}

}
