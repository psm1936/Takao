import java.util.Arrays;

public class Ex13 {

	public static void main(String[] args) {
		System.out.println(reverseStr("ZAbcdVefEg"));

	}
	
	public static String reverseStr(String str1) {
		String result ="";
		int[] s = new int[str1.length()]; //길이.
		for (int i = 0; i < s.length; i++) {
			s[i]= str1.charAt(i);
		}
		for (int i = 0; i < s.length-1; i++) { //선택 정렬
			for (int j = 0; j < s.length-1-i; j++) {
				if(s[j]>s[j+1]) {
					int temp = s[j];
					s[j]= s[j+1];
					s[j+1]= temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) { 
			result += (char)s[i];   // int로 저장된걸 형변환시켜 string에 담을 수있게 문자열로 바꾼다.
			
		}
		return result;
	}

}
