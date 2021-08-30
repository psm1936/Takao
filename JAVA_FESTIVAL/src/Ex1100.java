import java.util.Random;

public class Ex1100 {

	public static void main(String[] args) {
		Random rd = new Random();

		int[] range = new int[8];
		
		for (int i = 0; i < range.length; i++) {
			range[i] = rd.nextInt(60) + 1;
			System.out.print(range[i] + " ");
		}
		System.out.println("");
		
		int max = range[0];
		int min = range[0];
		for (int i = 0; i < range.length; i++) {
			if (max < range[i]) {
				max = range[i];
			}
		}
	
		for (int i = 0; i < range.length; i++) {
		      if(min>range[i]) {
		    	  min=range[i];
		      }
		}
		System.out.println("큰수" + max);
		System.out.println("작은수"+min);

	}

}
