
public class MonitorMain {

	public static void main(String[] args) {
		
		Math.pow(2,3); //static o
		//Random.nextInt(); // static x
		
		Monitor.lightup();   //static -> ��ü ���� ���ص� ȣ�Ⱑ��
//		Monitor.on(); // static�� ���� ���� �ּҰ� ���� ->��ü������ �ؾ����� ȣ�� ����
		
		// Monitor ��ü ����
		
		Monitor m = new Monitor();
		
		m.on();
		m.lightup();
	}

}
