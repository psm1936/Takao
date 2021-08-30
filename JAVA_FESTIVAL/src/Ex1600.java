
public class Ex1600 {

	public static void main(String[] args) {
		int num = 1;
		
		int[][] n = new int[5][5];
		
		for (int i = 0; i < n.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < n.length; j++) {
					n[i][j] = num;
					num++;
				}
			}else if(i%2 == 1) {
				for (int j = 4; j >= 0; j--) {
					n[i][j]= num;
					num++;
				}
			}
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j]+"\t");
			}System.out.println("");
		}
	}

}
