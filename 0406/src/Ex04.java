
public class Ex04 {

	public static void main(String[] args) {
		// 정수형 데이터 10 개 담기.
		int[] num = {2,7,5,6,9,15,23,78,40,20};
		
		// 짝수 데이터만 출력	
		String a ="";
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0) {
				a+=num[i]+" ";
			}
		}
		System.out.println("num에 들어있는 짝수는 "+a+"입니다.");
		System.out.println("");
		
//		System.out.print("num에 들어있는 짝수는 ");
//		for (int i = 0; i < num.length; i++) {
//			if(num[i]%2==0) {
//				 System.out.print(num[i]+" ");
//			}
//		}
//		System.out.println("입니다");
		
		//홀수데이터만 출력 및
		String b= "";
		int cnt =0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2!=0) {
				b+=num[i]+" ";
				cnt+=1;
			}
		}
		System.out.println("num에 들어있는 홀수는 "+b+"이며,\n총 "+cnt+"개 입니다.");
		System.out.println(b.length());
		
//		System.out.print("num에 들어있는 홀수는 ");
//		int cnt =0;
//		for (int i = 0; i < num.length; i++) {
//			if(num[i]%2==1) {
//				System.out.print(num[i]+" ");
//				cnt+=1;
//			}
//		}
//		System.out.println("이며, 총 "+cnt +"개 입니다.");
		
	}

}
