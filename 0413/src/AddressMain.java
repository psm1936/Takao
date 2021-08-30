
public class AddressMain {

	public static void main(String[] args) {
		Address ad = new Address();
		
		ad.name = "무야호 할아버지";
		ad.address ="에베레스트 산맥근처";
		ad.number ="010-7779-9997";
		
		ad.showAddr();
		
		Address ad2=new Address();
		ad2.name = "차현석";
		ad2.address = "광주";
		ad2.number = "010-1111-1111";
		ad2.showAddr();
		
		Address ad3 = ad2;
		ad3.name ="김미희";
		
		System.out.println(ad2.name);
	}

}
