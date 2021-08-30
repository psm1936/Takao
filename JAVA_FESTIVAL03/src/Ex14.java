import java.util.Arrays;

public class Ex14 {

	public static void main(String[] args) {
		int A[] = {1,3,5,7,9,11,13,15,17,19};
		int B[]	= {2,4,6,8,10,12,14,16,18,20};
		int Merge[] = mergeArray(A,B);
		System.out.println(Arrays.toString(Merge));

	}
	
	public static int[] mergeArray(int A[], int B[]) {
		int[] c = new int[A.length + B.length];
		for (int i = 0; i < A.length; i++) {
			c[i] = A[i];
		}
		for (int i = 0; i < B.length; i++) {
			c[10+i]= B[i];
		}
		
		for (int i = 0; i < c.length-1; i++) {
			int index = i;
			for (int j = i+1; j < c.length; j++) {
				if(c[index]>c[j]) {
					index = j;
				}
			}
			int temp = c[i];
			c[i]= c[index];
			c[index]=temp;
			
		}
		return c;
	}

}
