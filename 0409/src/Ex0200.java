import java.util.Scanner;

public class Ex0200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���þ� >> ");
		String startText = sc.next();

//		while (true) {
//			System.out.print("�ܾ �Է��� �ּ��� >> ");
//			String endText = sc.next();
//			
//			char lastChar =startText.charAt(startText.length() - 1);
//			char firstChar = endText.charAt(0);
//			
//			if (lastChar != firstChar) {
//				System.out.println("�z�Ƚ��ϴ�.");
//				break;
//			} else {
//				startText = endText;
//
//			}
//		}

		while (true) {
			System.out.print("�ܾ �Է��� �ּ��� >> ");
			String endText = sc.next();

			String lastStr = startText.substring(startText.length() - 1);
			String firstStr = endText.substring(0, 1);

			if (!lastStr.equals(firstStr)) {    // equals �����ϴ� ���
				System.out.println("�z�Ƚ��ϴ�.");
				System.out.print("����Ͻðڽ��ϱ�? (Y/N) >> ");
				String re = sc.next();
				
				
				if (re.equals("N")) {
					System.out.println("������ ����Ǿ����ϴ�.");
					break;
				}else {
					System.out.print("���þ� >> ");
					startText = sc.next();
					continue;    // �̰ɷ�  �ٷ� ���� �ö� while �� ó������ ����.
				}
			} startText = endText;
		}
		
		
		

	}

}
