import java.util.Scanner;

public class Ex0200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("제시어 >> ");
		String startText = sc.next();

//		while (true) {
//			System.out.print("단어를 입력해 주세요 >> ");
//			String endText = sc.next();
//			
//			char lastChar =startText.charAt(startText.length() - 1);
//			char firstChar = endText.charAt(0);
//			
//			if (lastChar != firstChar) {
//				System.out.println("틑렸습니다.");
//				break;
//			} else {
//				startText = endText;
//
//			}
//		}

		while (true) {
			System.out.print("단어를 입력해 주세요 >> ");
			String endText = sc.next();

			String lastStr = startText.substring(startText.length() - 1);
			String firstStr = endText.substring(0, 1);

			if (!lastStr.equals(firstStr)) {    // equals 부정하는 방법
				System.out.println("틑렸습니다.");
				System.out.print("계속하시겠습니까? (Y/N) >> ");
				String re = sc.next();
				
				
				if (re.equals("N")) {
					System.out.println("게임이 종료되었습니다.");
					break;
				}else {
					System.out.print("제시어 >> ");
					startText = sc.next();
					continue;    // 이걸로  바로 위로 올라감 while 문 처음부터 돌림.
				}
			} startText = endText;
		}
		
		
		

	}

}
