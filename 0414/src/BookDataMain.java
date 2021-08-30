import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookData[] bd = new BookData[5];
		
		bd[0] = new BookData("Java", 21000, "홍길동");
		bd[1] = new BookData("C++", 29000, "박문수");
		bd[2] = new BookData("Database", 31000, "김장독");
		bd[3] = new BookData("Android", 18000, "이순신");
		bd[4] = new BookData("Web", 26000, "김철수");
		
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.println("구매 가능한 책 목록");
		for (int i = 0; i < bd.length; i++) {
			if(bd[i].getPrice()<=money) {
				System.out.println("[ "+bd[i].getTitle()+", "+bd[i].getWriter()+", "+bd[i].getPrice()+"원 ]");
			}
		}
	}

}
