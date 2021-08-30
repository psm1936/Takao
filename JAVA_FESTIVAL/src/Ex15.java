
public class Ex15 {

	public static void main(String[] args) {
		int[][] n = new int[5][5];

		int num =25;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				n[j][i]=num;
				num--;
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j]+"\t");
			}System.out.println("\n ");
		}
		
		
	}

	
	
}
