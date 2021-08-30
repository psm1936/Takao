import java.util.Random;

public class Ex11 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] num = new int[8];
		
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < num.length; i++) {
			num[i]= rd.nextInt(60);
			System.out.print(num[i]+" ");
		}
		System.out.println("");
		
		int max = num[0];
		int min = num[0];
		
		for (int i = 0; i < num.length; i++) {
		      if(max<num[i]) {
		    	  max=num[i];
		      }
		}	
		System.out.println("가장 큰 값 : "+max);
		
		for (int i = 0; i < num.length; i++) {
		      if(min>num[i]) {
		    	  min=num[i];
		      }
		}
		System.out.println("가장 작은 값 : "+min);
	}

}
