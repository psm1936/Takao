import java.util.Stack;

public class Ex11 {

	public static void main(String[] args) {
		
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(findKim(names));

	}
	
	public static String findKim(String[] names) {
		
		String result = "";
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals("Kim")) {
				result = "김서방은 "+(i+1)+"에 있다.";
			}
		}
		
		
		return result;
	}

}
