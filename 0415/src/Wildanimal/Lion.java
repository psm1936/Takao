package Wildanimal;

public class Lion extends WildAnimal {
	String name = "사자";  //필드는 오버라이딩 없음.
	//기능
	
	// (매서드)오버라이딩 : 부모클래스에 있는 기능을 자식 클래스에서 재정의 하는것
	// 매서드 이름 동일, 매개변수 타입, 
	// ++ static, private, final 로 선언된 메서드는 오버라이딩 할수 없다.
	
	@Override //annotation(주석):컴파일러에게 오버라이딩이 정확한지 확인하도록 지시
	public void hunt() {
		System.out.println("단독 사냥!");
	}
}
