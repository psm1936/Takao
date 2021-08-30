
public class Ex06 {

	public static void main(String[] args) {
		
		// 이차원 배열
		
		// 1차원 배열안의 값에 1차원 배열이 또 있다.
		
		//ex)
//		int[][] intArray = new int[3][2];  [ 행, 열 ]
		
		int[] pythonScore = new int[25];
		int[] javaScore = new int[25];
		int[] dbScore = new int[25];
		
		int[][] bigdataScore = new int[3][25];
		bigdataScore[0]=pythonScore;
		bigdataScore[1]=javaScore;
		bigdataScore[2]=dbScore;
		
		System.out.println(bigdataScore.length);
		System.out.println(bigdataScore[0].length);
		
		System.out.println("=====주소======");
		System.out.println(bigdataScore);
		System.out.println(bigdataScore[0]);
		System.out.println(bigdataScore[1]);
		System.out.println(bigdataScore[2]);
	}

}
