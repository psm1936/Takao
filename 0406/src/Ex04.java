
public class Ex04 {

	public static void main(String[] args) {
		// ������ ������ 10 �� ���.
		int[] num = {2,7,5,6,9,15,23,78,40,20};
		
		// ¦�� �����͸� ���	
		String a ="";
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0) {
				a+=num[i]+" ";
			}
		}
		System.out.println("num�� ����ִ� ¦���� "+a+"�Դϴ�.");
		System.out.println("");
		
//		System.out.print("num�� ����ִ� ¦���� ");
//		for (int i = 0; i < num.length; i++) {
//			if(num[i]%2==0) {
//				 System.out.print(num[i]+" ");
//			}
//		}
//		System.out.println("�Դϴ�");
		
		//Ȧ�������͸� ��� ��
		String b= "";
		int cnt =0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2!=0) {
				b+=num[i]+" ";
				cnt+=1;
			}
		}
		System.out.println("num�� ����ִ� Ȧ���� "+b+"�̸�,\n�� "+cnt+"�� �Դϴ�.");
		System.out.println(b.length());
		
//		System.out.print("num�� ����ִ� Ȧ���� ");
//		int cnt =0;
//		for (int i = 0; i < num.length; i++) {
//			if(num[i]%2==1) {
//				System.out.print(num[i]+" ");
//				cnt+=1;
//			}
//		}
//		System.out.println("�̸�, �� "+cnt +"�� �Դϴ�.");
		
	}

}
