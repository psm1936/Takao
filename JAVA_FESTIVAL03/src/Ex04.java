import javax.naming.spi.DirStateFactory.Result;

public class Ex04 {

	public static void main(String[] args) {
		
		int[][] arr = new int[7][7];
		int num =1;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 3-i; j < 4+i; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for (int i = 4; i < 7; i++) {
			for (int j = i-3; j < 10-i; j++) {
				arr[i][j]=num;
				num++;
			}		
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
	    
		
	}

}
