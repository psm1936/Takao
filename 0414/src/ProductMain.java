import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Product> pd = new ArrayList<Product>();
		int num = 0;

		while (true) {
			System.out.print("[1]���� �߰� [2]���� �Ǹŷ� ��ȸ [3]���� >> ");
			num = sc.nextInt();

			if (num == 1) {
				System.out.print("���� �̸� : ");
				String name1 = sc.next();
				System.out.print("�ܰ� : ");
				int mNum = sc.nextInt();
				System.out.print("���� : ");
				int rNum = sc.nextInt();
				
				pd.add(new Product(name1, mNum, rNum));

			} else if (num == 2) {
				System.out.println("��ǰ��\t�ܰ�\t����");
				for (int j = 0; j < pd.size(); j++) {
					System.out.println(pd.get(j).getName() + "\t" + pd.get(j).getUnitPrice() + "\t" + pd.get(j).getUnitPrice());
				}

			} else if (num == 3) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}

}
