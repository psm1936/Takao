
public class Ex10 {

	public static void main(String[] args) {
		
		// ������  !!
		// �ϳ��� ������ ���� ���� ������� ���� �������� �ڽ��� ���������ʰ� �� ������ ������.     
		 
		int startValue =2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}
	
	public static void getPerfectNumber(int num1 , int num2) {
		System.out.print("2~1000������ ������ : ");
		for (int i = num1; i < num2; i++) {
			int sum =0;
			
			for (int j = 1; j <= i; j++) {
				if(i%j ==0) {
					sum +=j;
				}
			}
			if(sum-i==i) {
				System.out.print(i+" ");
			}
		}
	}

}
