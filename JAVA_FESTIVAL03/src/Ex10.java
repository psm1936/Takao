
public class Ex10 {

	public static void main(String[] args) {
		
		// 완전수  !!
		// 하나의 정수를 나눠 나온 약수들을 전부 더했을때 자신을 포함하지않고 그 정수와 같을때.     
		 
		int startValue =2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}
	
	public static void getPerfectNumber(int num1 , int num2) {
		System.out.print("2~1000까지의 완전수 : ");
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
