
public class PhoneMain {

	public static void main(String[] args) {
		
		//Telephone 객체 생성
		Telephone t = new Telephone();
		
		t.call();
		//서브 클래스 기능에서
		
		
		//Smartphone 객체 생성
		Smartphone s =new Smartphone();
		
		// 슈퍼 클래스 기능은 서브 클래스에서 사용 가능
		s.call();
		s.internet();
		s.touch();

	}

}
