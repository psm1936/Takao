import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		// 배열의 한계
		// 고정 크기를 넘어선 값을 저장할 수 없다.
		
		// Collection
		// 요소라고 불리는 가변 개수의 객체들의 집합.
		// 특징
		// 기본 자료형 요소로 불가능.
		
		// ArrayList
		// 가장 보편적으로 많이 사용, 컬랙션 클래스로 객체를 저장.
		ArrayList<String> list = new ArrayList<String>();
		// 데이터 추가
		list.add("Hello");
		list.add("Hi");
		list.add("java");
	
		//데이터 가져오기
		System.out.println(list.get(0));
		
		// 중간에 데이터 삽입
		list.add(1,"pythonn");
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 데이터 개수
		System.out.println(list.size());
		
		// 데이터 삭제
		list.remove(0);		
		System.out.println(list.get(0));
		
		// 모든 요소 삭제  
		list.clear();
		System.out.println(list.size());
		
	
	}

}
