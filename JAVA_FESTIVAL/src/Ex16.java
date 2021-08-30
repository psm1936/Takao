
public class Ex16 {

	public static void main(String[] args) {

		// 정수 n 입력 받고 배열 정방향 역방향으로 저장하고 출력

		int[][] n = new int[5][5];

		int num = 1;
		for (int i = 0; i < n.length; i++) {
			
			if(i%2 ==0) {  // 행 0,2,4,6 구하기
				for (int j = 0; j < n.length; j++) {
					n[i][j] = num;  //위치 정방향 저장
					num++;
				}
			}else {   // 행  1,3,5
				for (int j = 4; j >= 0; j--) { //위치를 역순으로 해서 저장.
					n[i][j] = num; 
					num++;
				}
			}
				
			
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j] + "\t"); // 순서대로 출력
			}
			System.out.println("\n");
		}
		

	}

}
