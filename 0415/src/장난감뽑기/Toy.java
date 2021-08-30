package 장난감뽑기;

public class Toy {
	private int x= 10;
	//protected : 같은 패키지, 상속관계 접근가능
	protected int y= 10;
	public void play() {
		System.out.println("놀다");
	}
	
}
