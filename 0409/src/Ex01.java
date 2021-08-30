import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = "아뇨 누우니 아침이에여!";
//		
//		// 문자열.indexOf("문자") -> 매개변수로 넣은 문자의 위치 리턴
//		
//		System.out.println("==indexOf==");
//		System.out.println(data.indexOf("아",5));  // 앞에껄 찾고 ,5이후로 찾음
//		
//		// 문자열.contains("문자") -> 매개변수로 넣은 문자열이 포함되어 있는지 판별		
//		System.out.println("==contains==");
//		System.out.println(data.contains("여"));  //포함되어 있는지 True,False 로 확인.
//		System.out.println(data.contains("!"));
		
//		String data1 = "010-2407-1065";
//		
//		System.out.print("검색할 문자 입력 : ");
//		String m = sc.next();
//		
//		if(data1.contains(m)) {
//			System.out.println(m+"은 포함되어있습니다.");
//		}else {
//			System.out.println(m+"은 문자열에 포함되어있지 않습니다.");
//		}
		
		// 문자열.substrind(startIndex, endIndex)
		// 매개변수로 넣은 위치부터 문자열을 잘라서 리턴하는 메소드
		System.out.println("==substring==");
		System.out.println(data.substring(4));
		System.out.println(data.substring(1, 7));
		
		// 문자열.charAt(인덱스) -> 문자열에서 매개변수로 넣은 인덱스번째 문자를 반환
		System.out.println("==charAt==");                  // 문자 하나 뽑아옴.
		System.out.println(data.charAt(data.length()-1));  // 인덱싱하는것과 비슷
		
		
	}

}
