
public class Ex03 {

	public static void main(String[] args) {
		int input =5;
		int st =0;
		
		char aString = 65;
			
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input-st; j++) {          
				if(j>= st) {
					System.out.print(aString + " ");        //�� ������ ��ĭ�� �پ����� �� ���.
					aString++;
				}else {
					System.out.print(" "+" ");              // ����� ���
				}				
				
			}
			st = i< (input/2)? st+1 : st-1;                 // �߰��κп��� �ٽ� Ŀ���� ����� ���ǹ�  i �� Ŀ���� �������� input/2 �� ���� �Ѱ� �ǰ� �°Եȴٸ�  st+1�� �����ȴ�.
			System.out.println("");                         // �ٽ� ���ư��� ��µȴ�.
		}

	}

}
