
public class Ex1302 {

	public static void main(String[] args) {
		System.out.println(reverseStr("ZAbcdVefEg"));

	}
	
	public static String reverseStr(String str) {
		String result ="";
		int[] astr = new int[str.length()];
		
		for (int i = 0; i < astr.length; i++) {
			astr[i] = str.charAt(i);
		}
		
		for (int i = 0; i < astr.length-1; i++) {
			for (int j = 0; j < astr.length-1-i; j++) {
				if(astr[j]>astr[j+1]) {
					int temp = astr[j];
					astr[j]= astr[j+1];
					astr[j+1]= temp;
				}
			}
		}
		for (int i = 0; i < astr.length; i++) {
			result +=(char)astr[i];
		}
		
		
		return result;
	}

}
