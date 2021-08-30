
public class Ex01 {

	public static void main(String[] args) {
		
		// 배열
		
		// 같은 타입 의 여러 변수를 하나의 묶음으로 다루는것.
		// 순차적으로 저장됨, 반복문을 이용해 처리할수 있다, 0 부터 시작
		
		// 배열, 레퍼런스 변수선언 -> 주소를 저장, int 형배열, 기본타입 아님.
		int[] intArray;  //배열 변수, 일반적으로 이렇게 변수 선언.
		
		// 배열 생성
		
		intArray=new int[5];  //선언 해주고, 변수를 5개 받을 수 있다. 주소값이 담겨있다, 현재 값은 없다.
		System.out.println(intArray);
		
		intArray[0]=15;
		System.out.println(intArray[0]);
		
		// 배열 선언과 동시에 초기화		
		int[] array = {4,3,2,1,0};		
		System.out.println(array[2]);
		
		int[] b;
//		b = {1,2,3,4,5};      실행오류
		int[] a= new int[5];
//		a = {1,2,3,4,5};	    실행오류		
								
		
	}

}
