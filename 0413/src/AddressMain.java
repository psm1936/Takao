
public class AddressMain {

	public static void main(String[] args) {
		Address ad = new Address();
		
		ad.name = "����ȣ �Ҿƹ���";
		ad.address ="��������Ʈ ��Ʊ�ó";
		ad.number ="010-7779-9997";
		
		ad.showAddr();
		
		Address ad2=new Address();
		ad2.name = "������";
		ad2.address = "����";
		ad2.number = "010-1111-1111";
		ad2.showAddr();
		
		Address ad3 = ad2;
		ad3.name ="�����";
		
		System.out.println(ad2.name);
	}

}
