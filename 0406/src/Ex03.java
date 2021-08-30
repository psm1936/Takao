
public class Ex03 {

	public static void main(String[] args) {
		// 정수형 데이터 여러개를 담을 수 있는 레퍼런스 변수  array를 선언
		int[] array;
		
		// 정수형 데이터 5개를 담을 수 있도록 배열을 생성해서 array에 대입.
		array = new int[5];  // 0으로 초기화되어있음.
		
		// 각각의 인덱스에 1~20 사이의 숫자 대입
		array[0] =20;
		array[1] =10;
		array[2] =8;
		array[3] =13;
		array[4] =1;
		
		// 배열 array에 들어있는 모든 데이터를 출력
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		// 배열 더하기.
		System.out.println(array[1]+array[4]);
		
		// 배열 array에 들어있는 모든 데이터 더해서 결과 출력
		int sum=0;		
		for (int i = 0; i < array.length; i++) {
			sum +=array[i];			
		}
		System.out.println(sum);
		System.out.println((float)sum/array.length);
		
	}

}
