import java.util.Scanner;

public class Ex10_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10������ 2������ ��ȯ
	    //N%2�� �迭�� ��Ƴ���
	    //�Ųٷ� ���
	    
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
		
		System.out.print("�� �Է� : ");
		int i = sc.nextInt();
		String binaryString = Integer.toBinaryString(i);
		System.out.println("2���� : "+binaryString);
	}

}
