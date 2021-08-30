
public class Ex0300 {

	public static void main(String[] args) {
		
		int range = 5;
		int st = 0;
		
		char aStr = 65;
		
		for (int i = 0; i < range; i++) {
			for (int j = 0; j < range-st; j++) {
				if(j>=st) {
					System.out.print(aStr+"\t");
					aStr++;
				}else {
					System.out.print(" "+"\t");
				}
			}
			st = i<range/2 ? st+1:st-1;
			System.out.println("");
		}

	       
	}

}
