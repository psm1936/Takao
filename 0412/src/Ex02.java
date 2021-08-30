
public class Ex02 {

	public static void main(String[] args) {
		int[] array = {2,7,3,5,4};
		boolean check = isDuplicate(array);
		System.out.println(check);

	}
	
	public static boolean isDuplicate(int[] array) {
		
		
		for (int i = 0; i < array.length; i++) {
			int chek2 = array[i];
			for (int j = i+1; j < array.length; j++) {
				if(chek2 == array[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
