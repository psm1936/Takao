import org.omg.CORBA.PUBLIC_MEMBER;

public class Ex04 {

	public static void main(String[] args) {

		// 메소드 (Method)
		// 객체의 행위를 표현하기 위한 것
		// 반복적으로 사용되는 코드를 줄이기 위해서 씀

		// 메소드의 기본 구조

		// public 접근 제한자 : 공용

		// 리턴 타입
		
		int result= addNumber(10, 15);
		System.out.println(result);

	}

	// 메인 Method 가 포함된 class 안에서 새로운 Method를 만들고자 할때는
	// static 키워드를 붙여준다.
	public static int addNumber(int n1, int n2) {  // public 바깥에서 쓸수 있음
		int result = n1 + n2;
		return result;

	}
}
