import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 메소드  배열  야구게임
		
		int[] array = {1,3,4,8,7,9,10};
		arrayToString(array);          // 호출만 하고 있음.
		
	}
	
	// static : 정적 (고정적인 주소값을 가지고 있다.)
	public static void arrayToString(int[] array) {     // 쓸 데이터 타입을 넣어줌.    다른 받아줄 타입이 있다면 거기에 맞춰서 타입 맞춰줌.
		
		for (int num : array) {
			System.out.print(num+" ");
		}	
	}

}
