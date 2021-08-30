import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5개의 정수형 데이터를 담을 수 있는 배열 생성
		
		int[] scoreArr = new int[5];
//		System.out.print("1번째 입력>> ");
//		scoreArr[0]=sc.nextInt();
//		System.out.print("2번째 입력>> ");
//		scoreArr[1]=sc.nextInt();
//		System.out.print("3번째 입력>> ");
//		scoreArr[2]=sc.nextInt();
//		System.out.print("4번째 입력>> ");
//		scoreArr[3]=sc.nextInt();
//		System.out.print("5번째 입력>> ");
//		scoreArr[4]=sc.nextInt();		
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print((i+1)+"번째 입력>> ");
			scoreArr[i]=sc.nextInt();		
		}
		
		System.out.print("입력된 점수: ");
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i]+" ");
		}
		
		

	}

}
