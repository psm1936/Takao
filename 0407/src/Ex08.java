
public class Ex08 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		int num = 21;
		for (int i = 0; i <array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {  //이것도 좋은 수.
				array[i][j]=num;
				num++;
				System.out.print(array[i][j]+"\t");
			}
			System.out.println("");
		}

	}

}
