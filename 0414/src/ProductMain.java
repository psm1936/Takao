import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Product> pd = new ArrayList<Product>();
		int num = 0;

		while (true) {
			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
			num = sc.nextInt();

			if (num == 1) {
				System.out.print("물건 이름 : ");
				String name1 = sc.next();
				System.out.print("단가 : ");
				int mNum = sc.nextInt();
				System.out.print("수량 : ");
				int rNum = sc.nextInt();
				
				pd.add(new Product(name1, mNum, rNum));

			} else if (num == 2) {
				System.out.println("제품명\t단가\t수량");
				for (int j = 0; j < pd.size(); j++) {
					System.out.println(pd.get(j).getName() + "\t" + pd.get(j).getUnitPrice() + "\t" + pd.get(j).getUnitPrice());
				}

			} else if (num == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
