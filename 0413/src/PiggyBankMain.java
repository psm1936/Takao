import javax.crypto.spec.PBEKeySpec;

public class PiggyBankMain {

	public static void main(String[] args) {
		PiggyBank pb = new PiggyBank();
		
		pb.deposit(1000);
		System.out.println("���� �ܾ� : "+pb.showMoney());
		pb.withdraw(500);
		System.out.println("���� �ܾ� : "+pb.showMoney());
		
		
	}
}
	


