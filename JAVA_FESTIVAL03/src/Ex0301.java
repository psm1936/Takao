
public class Ex0301 {

	public static void main(String[] args) {
		int input = 5;
		int st =0;
		char astr = 65;
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input-st; j++) {
				if(j>=st) {
					System.out.print(astr+"\t");
					astr++;
				}else {
					System.out.print(" "+"\t");
				}
			}
			st= i<input/2? st+1:st-1;
			System.out.println("");
		}
	}
}
