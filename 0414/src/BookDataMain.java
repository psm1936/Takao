import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookData[] bd = new BookData[5];
		
		bd[0] = new BookData("Java", 21000, "ȫ�浿");
		bd[1] = new BookData("C++", 29000, "�ڹ���");
		bd[2] = new BookData("Database", 31000, "���嵶");
		bd[3] = new BookData("Android", 18000, "�̼���");
		bd[4] = new BookData("Web", 26000, "��ö��");
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		System.out.println("���� ������ å ���");
		for (int i = 0; i < bd.length; i++) {
			if(bd[i].getPrice()<=money) {
				System.out.println("[ "+bd[i].getTitle()+", "+bd[i].getWriter()+", "+bd[i].getPrice()+"�� ]");
			}
		}
	}

}
