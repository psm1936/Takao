
public class Ex02 {

	public static void main(String[] args) {
		int[][] p = new int[5][5];
		
		int num =1;
		System.out.println("원본");
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				p[i][j] = num;
				num++;
				System.out.print(p[i][j]+"\t");
			}System.out.println("");
		}System.out.println("");
		System.out.println("180도 회전");
		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(p[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
