import java.util.Scanner;

public class Ex10_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10진수를 2진수로 변환
	    //N%2를 배열에 담아내기
	    //거꾸로 출력
	    
//	    int input = sc.nextInt();
//	    int[] arr = new int[10];
//	    int i = 0;
//	    
//	    while(input > 0){
//	       arr[i] = input % 2;
//	         input /= 2;
//	         i++;
//	    }
//	    
//	    i--;
//	    
//	    for(; i >= 0; i--){
//	       System.out.print(arr[i]);
//	    }
		
		System.out.print("수 입력 : ");
		int i = sc.nextInt();
		String binaryString = Integer.toBinaryString(i);
		System.out.println("2진수 : "+binaryString);
	}

}
