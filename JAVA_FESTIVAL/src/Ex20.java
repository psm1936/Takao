
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
		System.out.println("����");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("90�� ȸ��");
		for (int i = 4; i>=0 ; i--) {                  //���� ���� �ݴ�� ��� ������ ���϶� ���� ��� ������ ����.
			for (int j = 0; j < 5; j++) {
				System.out.print(a[j][i]+"\t");
			}
			System.out.println("\n");
		}
	}

}
