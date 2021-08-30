
public class Ex07 {

	public static void main(String[] args) {
//		int[][] array = new int[5][5];
//		int[] num1 = {1,2,3,4,5};
//		int[] num2 = {6,7,8,9,10};
//		int[] num3 = {11,12,13,14,15};
//		int[] num4 = {16,17,18,19,20};
//		int[] num5 = {21,22,23,24,25};
//		array[0]=num1;
//		array[1]=num2;
//		array[2]=num3;
//		array[3]=num4;
//		array[4]=num5;
				
//		int num = 21;
		
		int[][] array = new int[5][5];
	      int num = 20;
	      
	      for (int i = 0; i < array.length; i++) {
	         for (int j = 0; j < array[i].length; j++) {
	            num++;
	            array[j][i] = num;
	         }
	      }
	      // 출력문 1
//	      for(int i = 0 ; i <array.length; i++) {
//	         for(int k=0; k <array[i].length; k++) {
//	            System.out.print(array[i][k]+"\t");
//	      }
//	         System.out.println();
//	         }
	      
	      for(int k=0; k<array[0].length;k++) {
	    	  for (int i = 0; i < array.length; i++) {
				System.out.print(array[k][i]+"\t");
			}System.out.println("");
	      }
	      
		
//		for (int i = 0; i <array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {  //이것도 좋은 수.
//				array[i][j]=num;
//				num++;
////				System.out.print(array[j][i]+"\t");
//			}
////			System.out.println("");
//		}
//		for (int i = 0; i < array.length; i++) {
//			
//		}
		
//		
		
//		for (int i = 0; i <array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {  //이것도 좋은 수.
//				array[i][j]=num;
//				num++;
//				System.out.print(array[i][j]+"\t");
//			}
//			System.out.println("");
//		}
		
	}

}
