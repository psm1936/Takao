
public class MonitorMain {

	public static void main(String[] args) {
		
		Math.pow(2,3); //static o
		//Random.nextInt(); // static x
		
		Monitor.lightup();   //static -> 객체 생성 안해도 호출가능
//		Monitor.on(); // static이 없어 고정 주소가 없음 ->객체생성을 해야지만 호출 가능
		
		// Monitor 객체 생성
		
		Monitor m = new Monitor();
		
		m.on();
		m.lightup();
	}

}
