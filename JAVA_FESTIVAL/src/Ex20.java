
public class Ex20 {

	public static void main(String[] args) {
		int[][] a =new int[5][5];
		int num =1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=num;
			      num++;
			}
		}
		System.out.println("원본");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("90도 회전");
		for (int i = 4; i>=0 ; i--) {                  //조건 순서 반대로 출력 조건이 참일때 공식 계속 돌릴수 있음.
			for (int j = 0; j < 5; j++) {
				System.out.print(a[j][i]+"\t");
			}
			System.out.println("\n");
		}
	}

}
