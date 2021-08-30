
public class Ex0600 {

	public static void main(String[] args) {
		System.out.println(getMiddle("test"));
	}
	
	public static String getMiddle(String name) {
		int range = name.length();
		String result ="";
		if(range%2 ==0) {
			result = name.substring(range/2-1,range/2+1);
		}else {
			result = name.substring(range/2,range/2+1);
		}
		return result;
	}

}
