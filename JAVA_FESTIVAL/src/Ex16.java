
public class Ex16 {

	public static void main(String[] args) {

		// ���� n �Է� �ް� �迭 ������ ���������� �����ϰ� ���

		int[][] n = new int[5][5];

		int num = 1;
		for (int i = 0; i < n.length; i++) {
			
			if(i%2 ==0) {  // �� 0,2,4,6 ���ϱ�
				for (int j = 0; j < n.length; j++) {
					n[i][j] = num;  //��ġ ������ ����
					num++;
				}
			}else {   // ��  1,3,5
				for (int j = 4; j >= 0; j--) { //��ġ�� �������� �ؼ� ����.
					n[i][j] = num; 
					num++;
				}
			}
				
			
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j] + "\t"); // ������� ���
			}
			System.out.println("\n");
		}
		

	}

}
