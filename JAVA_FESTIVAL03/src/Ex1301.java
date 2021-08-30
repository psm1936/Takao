
public class Ex1301 {

	public static void main(String[] args) {
		System.out.println(reverseStr("ZAbcdVefEg"));

	}
	
	public static String reverseStr(String str) {
		String result ="";
		int[] s= new int[str.length()];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = str.charAt(i);			
		}
		
		for (int i = 0; i < s.length-1; i++) {
			for (int j = 0; j < s.length-1-i; j++) {
				if(s[j]>s[j+1]) {
					int temp = s[j];
					s[j]= s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			result +=(char)s[i];  //강제 형변환
		}
		return result;
		
	}
}
